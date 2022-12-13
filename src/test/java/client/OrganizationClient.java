package client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.organization.OrganizationResponseDto;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

public class OrganizationClient extends AbstractClient {

    public static final String URL = "https://api.trello.com/1/organizations/";

    public OrganizationResponseDto postNewOrganization(String displayName) throws IOException {
        HttpResponse response = postRequest(URL + "?displayName=" + displayName);
        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        return new ObjectMapper().readValue(response.getEntity().getContent(), new TypeReference<>() {
        });
    }

    public OrganizationResponseDto getOrganizationById(String id) throws IOException {
        HttpResponse response = getRequest(URL + id);
        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode(), "Couldn't find an organization with id " + id);
        return new ObjectMapper().readValue(response.getEntity().getContent(), new TypeReference<>() {
        });
    }

    public void deleteOrganizationById(String id) throws IOException {
        HttpResponse response = deleteRequest(URL + id);
        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
    }
}
