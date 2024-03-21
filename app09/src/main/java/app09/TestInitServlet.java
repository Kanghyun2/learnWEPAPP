package app09;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/testInit")
public class TestInitServlet extends HttpServlet {
	// Lazy - Singleton
	@Override
	public void init() throws ServletException {
		// 서블릿 생성 시에 호출해야 하는 문장을 작성할 수 있다. (생성자 Override X)
		// 서블릿 설정 등...
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
