package app09;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class TestInitConfigServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		String initParameter = config.getInitParameter("configName");
		System.out.println("초기화 시 사용 가능한 설정값: " +initParameter);
	}
}
