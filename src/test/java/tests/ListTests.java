package tests;

import client.BoardClient;
import client.ListClient;
import client.OrganizationClient;
import dataproviders.ListInputDataProvider;
import dto.board.BoardResponseDto;
import dto.list.ListPostRequestDto;
import dto.list.ListResponseDto;
import dto.organization.OrganizationResponseDto;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTests {

    public static ListClient listClient = new ListClient();
    public static BoardClient boardClient = new BoardClient();
    public static OrganizationClient organizationClient = new OrganizationClient();
    public static String organizationId;
    public static String boardId;

    @BeforeAll
    static void createTestSpace() throws IOException {
        OrganizationResponseDto newOrgResponse = organizationClient.postNewOrganization("testSpaceForLists");
        organizationId = newOrgResponse.getId();
        BoardResponseDto boardResponse = boardClient.postNewBoard("testBoardForListTests");
        boardId = boardResponse.getId();
    }

    @Test
    @DisplayName("POST a new list with required fields : name and boardId")
    public void testPostNewListWithCustomName() throws IOException {
        String listName = "TestList_" + RandomStringUtils.random(5, true, true);
        ListResponseDto newList = listClient.postNewList(listName, boardId);
        assertEquals(listName, newList.name(), "The name of the new list should be " + listName);
    }

    @Test
    @DisplayName("POST a new list with all fields")
    public void testPostNewListWithAllFields() throws IOException {
        ListPostRequestDto request = new ListInputDataProvider().getListInputTemplate().setIdBoard(boardId);
        ListResponseDto newList = listClient.postNewList(request);
        assertEquals("NewName", newList.name(), "The name of the new list should be NewName");
    }

    @AfterAll
    static void deleteTestSpace() throws IOException {
        organizationClient.deleteOrganizationById(organizationId);
    }
}
