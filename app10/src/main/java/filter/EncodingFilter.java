package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class EncodingFilter implements Filter {
	private String encoding;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		encoding = filterConfig.getInitParameter("Encoding");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 요청을 처리하는 흐름의 전/후에 개입가능한 코드 조각을 작성할 수 있습니다.
//		System.out.println("필터 처리 시작");
		HttpServletRequest req = (HttpServletRequest) request;
		req.setCharacterEncoding(encoding);
		
		chain.doFilter(request, response);
		
		
//		System.out.println("필터 처리 완료");
	}
	
}
