package client;

import com.fasterxml.jackson.databind.ObjectMapper;
import dto.list.ListPostRequestDto;
import dto.list.ListResponseDto;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

public class ListClient extends AbstractClient {

    public static final String URL = "https://api.trello.com/1/lists/";

    public ListResponseDto postNewList(String name, String idBoard) throws IOException {
        HttpResponse response = postRequest(URL + "?name=" + name + "&idBoard=" + idBoard);
        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        return new ObjectMapper().readValue(response.getEntity().getContent(), ListResponseDto.class);
    }

    public ListResponseDto postNewList(ListPostRequestDto params) throws IOException {
        HttpResponse response = postRequest(URL, params);
        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        return new ObjectMapper().readValue(response.getEntity().getContent(), ListResponseDto.class);
    }

}
