package core_java_made_easy.HttpClient_Features.HttpClientAsyn;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientAsynDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
//        HttpClient client = HttpClient.newBuilder();

        HttpRequest request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Authors")).GET().build();

        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        CompletableFuture<Integer> integerCompletableFuture = response.thenApply(HttpResponse::statusCode);
        Integer integer = integerCompletableFuture.get();

        System.out.println("Status Code: "+integer);
        System.out.println("Body: "+response.thenApply(HttpResponse::body).get());


        HttpRequest request2 = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Authors"))
                .POST(HttpRequest.BodyPublishers.ofString("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"idBook\": 0,\n" +
                        "  \"firstName\": \"string\",\n" +
                        "  \"lastName\": \"string\"\n" +
                        "}")).header("Content-Type","application/json").build();

        CompletableFuture<HttpResponse<String>> response2 = client.sendAsync(request2, HttpResponse.BodyHandlers.ofString());
        CompletableFuture<Integer> integerCompletableFuture2 = response2.thenApply(HttpResponse::statusCode);
        Integer integer2 = integerCompletableFuture2.get();

        System.out.println("Status Code: "+integer2);
        System.out.println("Body: "+response.thenApply(HttpResponse::body).get());

    }
}
