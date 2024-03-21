package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter (filterName = "AuthFilter"
//			, urlPatterns = { "/my", "/your" }
			, urlPatterns =  "/service/*"
		)
public class AuthFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		HttpSession session = req.getSession();
		String auth = (String) session.getAttribute("auth");
		if (auth == null) {
			// 로그인이 필요함을 알려줄 수 있는 페이지로 리다이렉트
			resp.setStatus(401);
			req.getRequestDispatcher("/WEB-INF/needlogin.jsp")
				.forward(req, resp);
			System.out.println("로그인 수행이 필요함");
		} else {
			chain.doFilter(request, response);
		}
	}

}
