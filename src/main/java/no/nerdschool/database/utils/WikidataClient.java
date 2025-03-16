package no.nerdschool.database.utils;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class WikidataClient {
    public static String getImageUrl(String wikidataKey) {
        return getImageUrls(wikidataKey).get(0);
    }

    public static List<String> getImageUrls(String wikidataKey) {
        String url = "https://www.wikidata.org/w/api.php?action=wbgetentities&ids=" + wikidataKey + "&props=claims&format=json";
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(new URI(url)).GET().build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String content = response.body();

            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(content);
            JsonNode claims = jsonNode.get("entities").get(wikidataKey).get("claims");
            JsonNode images = claims.get("P18");

            List<String> imageUrls = new ArrayList<>();
            for (int i = 0; i < images.size(); i++) {
                String fileName = images.get(i).get("mainsnak").get("datavalue").get("value").asText();
                String imageUrl = "https://commons.wikimedia.org/w/thumb.php?f=" + fileName.replace(" ", "%20") + "&w=300";
                imageUrls.add(imageUrl);
            }
            return imageUrls;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
