package it.formarete.servletjsp;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/calculate")
public class InputValidationFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("ECCOLO");
		String num1string = request.getParameter("num1");
		String num2string = request.getParameter("num2");
		
		try {
			
			int num1 = Integer.parseInt(num1string);
			int num2 = Integer.parseInt(num2string);
			chain.doFilter(request, response);
			
		} catch (NumberFormatException e) {
			
			request.setAttribute("error", "invalid input");
			request.getRequestDispatcher("calculator.jsp").forward(request, response);
			
		}
		
	}

	
}
