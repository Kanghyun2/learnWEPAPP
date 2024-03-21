package filter;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// 사용자의 요청 시간 (콘솔)기록 필터
@WebFilter(filterName = "LogFilter", urlPatterns = "/*")
public class LogFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("사용자 요청 시간 확인: " + now);
		
		chain.doFilter(request, response);
		
	}
	
}
