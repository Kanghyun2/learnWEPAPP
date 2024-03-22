package app13;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringJoiner;

public class TestWebHook {
	public static void main(String[] args) {

		final String urlSTR = "https://webhook.site/165bcc43-b537-47f3-86df-97f5baad8b52";

		HttpURLConnection conn = TestCarAPI.connect(urlSTR);

		try {
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=uft-8");
			conn.setDoOutput(true);

			Map<String, String> queryParamMap = new LinkedHashMap<>();
			queryParamMap.put("paramName", "paramValue");
			queryParamMap.put("korName", "한글값");

			String urlEncoded = getUrlEncodedParam(queryParamMap);

			try (OutputStream os = conn.getOutputStream()) {
				byte[] bytes = urlEncoded.getBytes();
				os.write(bytes, 0, bytes.length);
				os.flush();
			}

			int responseCode = conn.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				String body = TestCarAPI.readBody(conn.getInputStream());
				System.out.println("응답 바디: " + body);
			}
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			conn.disconnect();
		}
	}

	private static String getUrlEncodedParam(Map<String, String> queryParamMap) throws UnsupportedEncodingException {
		StringJoiner joiner = new StringJoiner("&");

		for (Entry<String, String> entry : queryParamMap.entrySet()) {
			String q = URLEncoder.encode(entry.getKey(), "UTF-8") + "=" + URLEncoder.encode(entry.getValue(), "UTF-8");
			joiner.add(q);
		}
		return joiner.toString();
	}
}
