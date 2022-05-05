package client;

import base.AbstractHttpMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

import java.io.IOException;
import java.util.*;

public abstract class AbstractClient extends AbstractHttpMessage {

    public HttpResponse getRequest(String url) throws IOException {
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("Accept", "application/json");
        return doRequest(httpGet);
    }

    public HttpResponse postRequest(String url) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        return doRequest(httpPost);
    }

    public HttpResponse postRequest(String url, Object params) throws IOException {
        String str = new ObjectMapper().writeValueAsString(params);
        StringEntity entity = new StringEntity(str, ContentType.APPLICATION_JSON);
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(entity);
        return doRequest(httpPost);
    }

    public HttpResponse deleteRequest(String url) throws IOException {
        HttpDelete httpDelete = new HttpDelete(url);
        return doRequest(httpDelete);
    }

    public HttpResponse putRequest(String url, Object params) throws IOException {
        HttpPut httpPut = new HttpPut(url);
        String str = new ObjectMapper().writeValueAsString(params);
        StringEntity entity = new StringEntity(str, ContentType.APPLICATION_JSON);
        httpPut.setEntity(entity);
        return doRequest(httpPut);
    }

    public HttpResponse doRequest(HttpUriRequest httpMessage) throws IOException {
        httpMessage.setHeader("Authorization", getHeaderAuthValue());
        return HttpClientBuilder.create()
                .build()
                .execute(httpMessage);
    }

    private String convertObjectToRequestURL(Object obj) throws JsonProcessingException {
        StringBuilder url = new StringBuilder();
        String objString = new ObjectMapper().writeValueAsString(obj);
        JSONObject jsonObject = new JSONObject(objString);
        Map<String, Object> map = jsonObject.toMap();
        for (Map.Entry<String, Object> a : map.entrySet()) {
            url.append(a.getKey()).append("=").append(a.getValue()).append("&");
        }
        return "?" + url;
    }
}