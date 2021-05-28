package it.formarete.servletjsp;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/*")
public class LoggingFilter implements Filter {

    
    public LoggingFilter() {
    }

    public void init(FilterConfig fConfig) throws ServletException {
    	System.out.println("initialize");
	}
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println(request.getParameter("name"));
		chain.doFilter(request, response);
		System.out.println("after");
	}
	
	public void destroy() {
	}

	
	

}
