package app11;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/file/list")
public class FileListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> fileNames = new ArrayList<>();
		
		File fileFolder = new File("d:\\mydata");
		File[] listFiles = fileFolder.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (pathname.isDirectory()) {
					return false;
				}
				return true;
			}
		});
		
		for (File f : listFiles) {
			fileNames.add(f.getName());
		}
		req.setAttribute("fileNames", fileNames);
		req.getRequestDispatcher("/filelist.jsp").forward(req, resp);
	}
}








