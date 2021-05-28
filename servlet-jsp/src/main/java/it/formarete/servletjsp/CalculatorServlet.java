package it.formarete.servletjsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")

public class CalculatorServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num1string = req.getParameter("num1");
		String num2string = req.getParameter("num2");
		
		int num1 = Integer.parseInt(num1string);
		int num2 = Integer.parseInt(num2string);
		
		Calculator calc = new Calculator();
		int sum = calc.sum(num1, num2);
		req.setAttribute("result", sum);
		
		resp.setContentType("text/html");
//		PrintWriter out = resp.getWriter();
//		out.write(""+sum);
		req.getRequestDispatcher("calculator.jsp").forward(req, resp);
	
	}
	

}
