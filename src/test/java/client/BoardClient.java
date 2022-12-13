package client;

import dto.board.BoardPostRequestDto;
import dto.board.BoardPutRequestDto;
import dto.board.BoardResponseDto;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class BoardClient extends AbstractClient {

    public static final String URL = "https://api.trello.com/1/boards/";

    public BoardResponseDto getBoardById(String id) throws IOException {
        HttpResponse response = getRequest(URL + id);
        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode(), "Couldn't find a board with id " + id);
        return new ObjectMapper().readValue(response.getEntity().getContent(), new TypeReference<>() {
        });
    }

    public HttpResponse getBoardById(String id, int status) throws IOException {
        HttpResponse response = getRequest(URL + id);
        Assertions.assertEquals(status, response.getStatusLine().getStatusCode());
        return response;
    }

    public BoardResponseDto postNewBoard(String name) throws IOException {
        HttpResponse response = postRequest(URL + "?name=" + name);
        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        return new ObjectMapper().readValue(response.getEntity().getContent(), new TypeReference<>() {
        });
    }

    public BoardResponseDto postNewBoard(BoardPostRequestDto params) throws IOException {
        HttpResponse response = postNewBoard(params, HttpStatus.SC_OK);
        return new ObjectMapper().readValue(response.getEntity().getContent(), new TypeReference<>() {
        });
    }

    public HttpResponse postNewBoard(BoardPostRequestDto params, int status) throws IOException {
        HttpResponse response = postRequest(URL, params);
        Assertions.assertEquals(status, response.getStatusLine().getStatusCode());
        return response;
    }

    public void postBoardWithEmptyName() throws IOException {
        HttpResponse response = postRequest(URL + "?name=");
        Assertions.assertEquals(HttpStatus.SC_BAD_REQUEST, response.getStatusLine().getStatusCode());
    }

    public BoardResponseDto updateExistingBoard(String id, BoardPutRequestDto params) throws IOException {
        HttpResponse response = putRequest(URL + id, params);
        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        return new ObjectMapper().readValue(response.getEntity().getContent(), new TypeReference<>() {
        });
    }

    public void deleteBoardById(String id) throws IOException {
        HttpResponse response = deleteRequest(URL + id);
        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
    }
}
