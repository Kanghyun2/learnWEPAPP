package app12;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

public class ServletUtil {
	public static String readBody(HttpServletRequest req) throws IOException {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader reader = req.getReader();) {
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		}
		return sb.toString();
	}
}
