package app11;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/file/download")
public class FileDownloadServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fileName = req.getParameter("fileName");
		System.out.println("파일 이름 확인: " + fileName);
		
		// 응답 헤더 설정
//		resp.setContentType("application/octet-stream"); // 브라우저는 '파일 다운로드' 동작 수행
		ServletContext servletContext = getServletContext();
		String mimeType = servletContext.getMimeType(fileName);
		resp.setContentType(mimeType);
		resp.setHeader("Content-disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));
		// 응답 바디 출력
		ServletOutputStream out = resp.getOutputStream();
		byte[] allBytes = Files.readAllBytes(Paths.get("d:\\mydata", fileName));
		out.write(allBytes, 0, allBytes.length);
		out.flush();
	}
}




