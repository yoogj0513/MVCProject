package com.yi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.mvc.CommandHandler;

public class SimpleHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		if(req.getMethod().equalsIgnoreCase("get")) {
			return "simpleForm.jsp";
		} else if (req.getMethod().equalsIgnoreCase("post")) {
			String test = req.getParameter("test");
			req.setAttribute("result", test);
			return "simpleResult.jsp";
		}
		return null;
	}

}
