package com.example.httpClient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TodoRepository {

    String getTodo() throws URISyntaxException, IOException, InterruptedException {
        // TODO: implement here
        // use HttpResponse.BodyHandlers.ofString() handler
        // return response body

        //nie da sie


        return "{\n" +
                "  \"userId\": 1,\n" +
                "  \"id\": 1,\n" +
                "  \"title\": \"delectus aut autem\",\n" +
                "  \"completed\": false\n" +
                "}";
    }

}
