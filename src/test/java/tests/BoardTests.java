package tests;

import client.BoardClient;
import client.OrganizationClient;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataproviders.BoardInputDataProvider;
import dataproviders.BoardUpdateDataProvider;
import dto.board.BoardPostRequestDto;
import dto.board.BoardResponseDto;
import dto.organization.OrganizationResponseDto;
import enums.PrefsBackground;
import helpers.FileHelper;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTests {

    public static BoardClient boardClient = new BoardClient();
    public static OrganizationClient organizationClient = new OrganizationClient();
    public static String organizationId;
    public static final String BASELINE_PATH = "baseline/boards/";

    @BeforeAll
    static void createTestSpace() throws IOException {
        OrganizationResponseDto newOrganization = organizationClient.postNewOrganization("testSpace");
        organizationId = newOrganization.getId();
    }

    @Test
    @DisplayName("POST a new board with required field name")
    public void testPostNewBoardWithCustomName() throws IOException {
        String boardName = "TestBoard_" + RandomStringUtils.random(5, true, true);
        BoardResponseDto newBoard = boardClient.postNewBoard(boardName);
        BoardResponseDto newBoardById = boardClient.getBoardById(newBoard.getId());
        assertEquals(boardName, newBoardById.getName(), "The name of the new board should be " + boardName);
        boardClient.deleteBoardById(newBoard.getId());
    }

    @Test
    @DisplayName("POST a new board with all fields")
    public void testPostBoardWithAllFields() throws IOException {
        BoardPostRequestDto boardInputRequest = new BoardInputDataProvider().getBoardInputTemplate().setIdOrganization(organizationId);
        BoardResponseDto newBoardResponse = boardClient.postNewBoard(boardInputRequest);
        BoardResponseDto baselineBoard = new ObjectMapper().readValue(FileHelper.getResourceAsString(BASELINE_PATH + "NewBoardResponseBaseline"), new TypeReference<>() {
        });
        assertThat(baselineBoard)
                .as("The new board is not equal to baseline data.")
                .usingRecursiveComparison()
                .ignoringFields("id", "idOrganization", "shortUrl", "url", "prefs.switcherViews")
                .isEqualTo(newBoardResponse);
    }

    @ParameterizedTest(name = "POST a new board with {0} background")
    @EnumSource(PrefsBackground.class)
    public void testPostNewBoardWithPrefsBackground(PrefsBackground prefsBackground) throws IOException {
        BoardPostRequestDto boardInputRequest = new BoardInputDataProvider().getBoardInputTemplate()
                .setPrefsBackground(prefsBackground)
                .setIdOrganization(organizationId)
                .setName("BoardWithBackground" + prefsBackground);
        BoardResponseDto newBoardResponse = boardClient.postNewBoard(boardInputRequest);
        assertEquals(boardInputRequest.getName(), newBoardResponse.getName(), "The name of the board should be " + boardInputRequest.getName());
        assertEquals(prefsBackground.toString(), newBoardResponse.getPrefs().getBackground(), "Background Name should be " + boardInputRequest.getPrefsBackground());
    }

    @Test
    @DisplayName("PUT request to update existing board")
    public void testUpdateBoardWithAllParameters() throws IOException {
        BoardPostRequestDto boardInputRequest = new BoardInputDataProvider().getBoardInputTemplate()
                .setIdOrganization(organizationId)
                .setName("TestBoardToUpdate");
        BoardResponseDto newBoard = boardClient.postNewBoard(boardInputRequest);
        BoardResponseDto updatedBoard = boardClient.updateExistingBoard(newBoard.getId(), new BoardUpdateDataProvider().getBoardUpdateTemplate());
        BoardResponseDto baselineBoard = new ObjectMapper().readValue(FileHelper.getResourceAsString(BASELINE_PATH + "UpdatedBoardResponseBaseline"), new TypeReference<>() {
        });
        assertThat(baselineBoard)
                .as("Updated board is not equal to baseline data.")
                .usingRecursiveComparison()
                .ignoringFields("id", "idOrganization", "shortUrl", "url")
                .isEqualTo(updatedBoard);
    }

    @Test
    @DisplayName("POST a new board with empty name")
    public void testNegativePostBoardWithEmptyName() throws IOException {
        BoardPostRequestDto boardInputRequest = new BoardInputDataProvider().getBoardInputTemplate()
                .setName("");
        HttpResponse response = boardClient.postNewBoard(boardInputRequest, HttpStatus.SC_BAD_REQUEST);
        assertEquals("invalid value for name", EntityUtils.toString(response.getEntity()));
    }

    @Test
    @DisplayName("GET non-existing board by id")
    public void testNegativeGetNonExistingBoardById() throws IOException {
        HttpResponse response = boardClient.getBoardById("999aa99a9aa9aa999a999aa9", HttpStatus.SC_NOT_FOUND);
        assertEquals("The requested resource was not found.", EntityUtils.toString(response.getEntity()));
    }

    @AfterAll
    static void deleteTestSpace() throws IOException {
        organizationClient.deleteOrganizationById(organizationId);
    }
}