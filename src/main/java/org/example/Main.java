package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        String apiKey = System.getenv("OPENAI_API_KEY");
        String uri = "https://api.openai.com/v1/chat/completions";

        String requestBody = """
                {
                    "model": "gpt-4o",
                    "messages": [
                        {"role": "system", "content": "You are a health expert"},
                        {"role": "user", "content": "Have men in their mid 50s seen improvements in their blood sugar and cholesterol after losing weight? Please refer me to specific case studies"}
                    ]
                }""";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("Content-Type","application/json")
                .header("Authorization","Bearer " + apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}