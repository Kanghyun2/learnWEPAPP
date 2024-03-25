package app12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myerrorpage")
public class MyErrorServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("예외 처리 서블릿입니다.");
		
		Exception e = (Exception) req.getAttribute(RequestDispatcher.ERROR_EXCEPTION);
		System.out.println("예외 객체에 접근해 메시지 출력: " + e.getMessage());
		
		resp.setStatus(400);
		resp.setContentType("text/plain; charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.println("잘못된 JSON 형식입니다. 다시 확인해주세요.");
		pw.flush();
	}
}



