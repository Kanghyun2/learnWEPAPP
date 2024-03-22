package app13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.databind.json.JsonMapper;

public class TestCarAPI {
	public static void main(String[] args) {
		final String URL = "https://myfakeapi.com/api/cars/";
		
		HttpURLConnection conn = connect(URL);
		try {
			conn.setRequestMethod("GET");
			
			int responseCode = conn.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				String body = readBody(conn.getInputStream());
				JsonMapper mapper = new JsonMapper();
				
				CarData carData = mapper.readValue(body, CarData.class);
				List<Car> cars = carData.getCars();
				
				for (Car c : cars) {
					System.out.println(c.getId() + ": " + c.getCar());
				}
			}
		} catch (IOException e) {
			// TODO: 예외처리
			e.printStackTrace();
		} finally {
			conn.disconnect();
		}
	}

	public static String readBody(InputStream inputStream) throws IOException {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		}
		
		return sb.toString();
	}

	public static HttpURLConnection connect(String urlStr) {
		try {
			URL url = new URL(urlStr);
			return (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			throw new RuntimeException("연결 구성이 실패했습니다.");
		}
	}
}
