package app13;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TestOkhttpPost {
	public static void main(String[] args) throws JsonProcessingException {
		String url = "https://webhook.site/165bcc43-b537-47f3-86df-97f5baad8b52";
		JsonMapper mapper = new JsonMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("propName", "propValue");
		String json = mapper.writeValueAsString(objectNode);
		
		OkHttpClient client = new OkHttpClient();
		RequestBody body = RequestBody.create(json, MediaType.get("application/json; charset=UTF-8"));
		Request request = new Request.Builder()
								.url(url)
								.post(body).build();
		try (Response resp = client.newCall(request).execute()) {
			System.out.println(resp.code());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
