package app10.myservice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/service/my")
public class MyServiceServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String auth = (String) session.getAttribute("auth");
		if (auth == null) {
			// 로그인이 필요함을 알려줄 수 있는 페이지로 리다이렉트
			System.out.println("마이 서비스 제공");
		}
		// 아래는 서비스 제공 문장들...
	}
}
