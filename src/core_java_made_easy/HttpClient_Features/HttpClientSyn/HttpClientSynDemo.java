package core_java_made_easy.HttpClient_Features.HttpClientSyn;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientSynDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
//        HttpClient client = HttpClient.newBuilder();

        HttpRequest request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Authors")).GET().build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status: "+response.statusCode());
        System.out.println("Body: "+response.body());

        HttpRequest request2 = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Authors"))
                .POST(HttpRequest.BodyPublishers.ofString("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"idBook\": 0,\n" +
                        "  \"firstName\": \"string\",\n" +
                        "  \"lastName\": \"string\"\n" +
                        "}")).header("Content-Type","application/json").build();

        HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status: "+response2.statusCode());
        System.out.println("Body: "+response2.body());
        HttpHeaders headers = response2.headers();
        System.out.println("Headers: "+headers.map());

    }
}
