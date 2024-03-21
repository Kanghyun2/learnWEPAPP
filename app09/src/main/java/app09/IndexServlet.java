package app09;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("사용자의 요청이 매핑되었어요.");
		req.setAttribute("message", "반가워요");
		req.getRequestDispatcher("welcome.jsp").forward(req, resp);
	}
}