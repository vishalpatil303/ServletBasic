package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/AddServlet")
public class AddServlet extends GenericServlet {

	BigDecimal number1;
	BigDecimal number2;
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		if (request.getParameter("number1") != null && request.getParameter("number1") != "") {
			number1 = BigDecimal.valueOf(Long.parseLong(request.getParameter("number1")));
		}else {
			number1 =BigDecimal.ZERO;
		}
		if (request.getParameter("number2") != null && request.getParameter("number2") != "") {
			number2 = BigDecimal.valueOf(Long.parseLong(request.getParameter("number2")));
		}else {
			number1 =BigDecimal.ZERO;
		}
		BigDecimal result = number1.add(number2);
		PrintWriter out = response.getWriter();
		out.print("Addition of First number : "+ number1 +" Second Number : "+number2 +" is :" +result);

	}

}
