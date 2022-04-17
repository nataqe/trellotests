package tests;

import client.BoardClient;
import client.OrganizationClient;
import dataproviders.BoardInputDataProvider;
import dataproviders.BoardUpdateDataProvider;
import dto.BoardPostRequestDto;
import dto.BoardPutRequestDto;
import dto.BoardResponseDto;
import dto.OrganizationResponseDto;
import enums.PrefsBackground;
import org.junit.jupiter.api.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.*;
import java.util.stream.*;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BoardTests {

    public static BoardClient boardClient = new BoardClient();
    public static OrganizationClient organizationClient = new OrganizationClient();
    public static String organizationId;

    @BeforeAll
    static void createTestSpace() throws IOException {
        OrganizationResponseDto newOrgResponse = organizationClient.postNewOrganization("testSpace");
        organizationId = newOrgResponse.getId();
    }

    @Test
    @DisplayName("POST a new board with required field name")
    public void postBoardTest() throws IOException {
        String boardName = "TestBoard_" + RandomStringUtils.random(5, true, true);
        BoardResponseDto boardResponse = boardClient.postNewBoard(boardName);
        BoardResponseDto newBoardResponse = boardClient.getBoardById(boardResponse.getId());
        Assertions.assertEquals(boardName, newBoardResponse.getName(), "The name of the board should be " + boardName);
        boardClient.deleteBoardById(boardResponse.getId());
        boardClient.getNonExistingBoardById(boardResponse.getId());
    }

    @Test
    @DisplayName("POST a new board with all fields")
    public void postBoardTestWithAllFields() throws IOException {
        BoardPostRequestDto boardInputRequest = new BoardInputDataProvider().getBoardInputTemplate().setIdOrganization(organizationId);
        BoardResponseDto newBoardResponse = boardClient.postNewBoard(boardInputRequest);
        Assertions.assertEquals(boardInputRequest.getName(), newBoardResponse.getName(), "The name of the board should be " + boardInputRequest.getName());
    }

    @ParameterizedTest(name = "POST a new board with {0} background")
    @EnumSource(PrefsBackground.class)
    public void postNewBoardWithPrefsBackground(PrefsBackground prefsBackground) throws IOException {
        BoardPostRequestDto boardInputRequest = new BoardInputDataProvider().getBoardInputTemplate()
                .setPrefsBackground(prefsBackground)
                .setIdOrganization(organizationId)
                .setName("BoardWithBackground" + prefsBackground);
        BoardResponseDto newBoardResponse = boardClient.postNewBoard(boardInputRequest);
        Assertions.assertEquals(boardInputRequest.getName(), newBoardResponse.getName(), "The name of the board should be " + boardInputRequest.getName());
        Assertions.assertEquals(prefsBackground.toString(), newBoardResponse.getPrefs().getBackground(), "Background Name should be " + boardInputRequest.getPrefsBackground());
    }

    @Test
    @DisplayName("POST a new board with empty name")
    public void postBoardTestWithEmptyName() throws IOException {
        boardClient.postBoardWithEmptyName();
    }

    @Test
    @DisplayName("PUT request to update existing board")
    public void updateBoardTestWithNewName() throws IOException {
        BoardPostRequestDto boardInputRequest = new BoardInputDataProvider().getBoardInputTemplate()
                .setIdOrganization(organizationId)
                .setName("TestBoardToUpdate");
        String newBoardId = boardClient.postNewBoard(boardInputRequest).getId();
        String newName = "TestBoardUpdated";
        BoardResponseDto updatedBoard = boardClient.updateExistingBoard(newBoardId, new BoardUpdateDataProvider().getBoardUpdateTemplate());
        Assertions.assertEquals(newName, updatedBoard.getName(), "The board name should be " + newName);
    }

    @ParameterizedTest(name = "PUT request to update existing board field {0}")
    @MethodSource("provideFieldsToUpdate")
    public void updateBoardWithOneParameter(String fieldName, BoardPutRequestDto params) throws IOException {
        BoardPostRequestDto boardInputRequest = new BoardInputDataProvider().getBoardInputTemplate()
                .setIdOrganization(organizationId)
                .setName("TestBoardToUpdate");
        String newBoardId = boardClient.postNewBoard(boardInputRequest).getId();
        BoardResponseDto updatedBoard = boardClient.updateExistingBoard(newBoardId, params);

    }

    public static Stream<Arguments> provideFieldsToUpdate() {
        return Stream.of(
                arguments("name", new BoardPutRequestDto().setName("UpdatedName")),
                arguments("desc", new BoardPutRequestDto().setDesc("NewDesc")),
                arguments("prefsBackground", new BoardPutRequestDto().setPrefsBackground(PrefsBackground.RED))
        );
    }

    @AfterAll
    static void deleteTestSpace() throws IOException {
        organizationClient.deleteOrganizationById(organizationId);
    }
}