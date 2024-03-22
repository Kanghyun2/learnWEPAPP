package app13;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TestOkhttpGet {
	public static void main(String[] args) {
		String url = "https://webhook.site/165bcc43-b537-47f3-86df-97f5baad8b52";
		
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
									.url(url)
									.build();
		
		try (Response resp = client.newCall(request).execute()) {
			System.out.println("응답코드 확인: " + resp.code());
			System.out.println("응답바디 확인: " + resp.body().string());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
