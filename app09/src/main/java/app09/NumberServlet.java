package app09;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/number")
public class NumberServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getMethod();
		
		if (method.equalsIgnoreCase("GET")) {
			req.getRequestDispatcher("numberForm.jsp")
				.forward(req, resp);
		} else if (method.equalsIgnoreCase("POST")) {
			String userNum = req.getParameter("userNum");
			String message = "";
			Integer num = null;
			try {
				num = Integer.valueOf(userNum);
				if (num > 0) {
					message = "양수입니다.";
				} else if (num < 0) {
					message = "음수입니다.";
				} else {
					message = "0입니다.";
				}
			} catch (NumberFormatException e) {
				message = "정수를 입력해야합니다.";
			}
			
			req.setAttribute("userNum", userNum);
			req.setAttribute("message", message);
			req.getRequestDispatcher("/WEB-INF/numberView.jsp")
				.forward(req, resp);
		}
	}
}




