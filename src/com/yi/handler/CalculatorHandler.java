package com.yi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.mvc.CommandHandler;

public class CalculatorHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		if(req.getMethod().equalsIgnoreCase("get")) {
			return "calculatorForm.jsp";
		} else if (req.getMethod().equalsIgnoreCase("post")) {
			
			String num1 = req.getParameter("num1");
			String num2 = req.getParameter("num2");
			String radio = req.getParameter("cal");
			
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			int result = 0;
			if(radio.equals("plus")) {
				result = n1 + n2;
			} else if (radio.equals("minus")) {
				result = n1 - n2;
			} else if (radio.equals("multi")) {
				result = n1 * n2;
			} else if (radio.equals("division")) {
				result = n1 / n2;
			}
			
			req.setAttribute("result", result);
			return "calculatorResult.jsp";
		}
		return null;
	}

}
