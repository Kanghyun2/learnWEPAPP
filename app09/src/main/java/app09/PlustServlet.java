package app09;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/plus")
public class PlustServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/plusForm.jsp")
			.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		
		int num1parsed = Integer.parseInt(num1);
		int num2parsed = Integer.parseInt(num2);
		int sum = num1parsed + num2parsed;
		
		req.setAttribute("result", sum);
		
		req.getRequestDispatcher("/WEB-INF/plusResult.jsp")
			.forward(req, resp);
	}
}
