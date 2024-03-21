package app09;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServerTimeServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 사용자의 특정 주소 요청을 매핑하여 서버 시간을 출력한 동적인 View 응답
		// 요청 제어 (서버 시간 값 생성 => 시간을 출력하는 동적 페이지 jsp로 forward)
		LocalDateTime now = LocalDateTime.now();
		
		req.setAttribute("now", now);
		req.getRequestDispatcher("/WEB-INF/now.jsp")
			.forward(req, resp);
	}
}


