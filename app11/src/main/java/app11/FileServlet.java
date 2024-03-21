package app11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/file")
@MultipartConfig
//(
//		location = "d:\\"
//		, fileSizeThreshold = 1024 * 1024 * 10
//		, maxFileSize = 1024 * 1024 * 50
//)
public class FileServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Part part = req.getPart("upload");
		for (String headerName : part.getHeaderNames()) {
			System.out.println(headerName + ": " + part.getHeader(headerName));
		}
		System.out.println(part.getName()); // 파라미터 이름 ("upload")가 출력됨.
		System.out.println(part.getSubmittedFileName());
		
		Path fileOutputFolder = Paths.get("d:\\mydata", part.getSubmittedFileName());
		Files.copy(part.getInputStream(), fileOutputFolder, StandardCopyOption.REPLACE_EXISTING);
	}
}





