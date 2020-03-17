package com.yi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.mvc.CommandHandler;

public class LoginHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		if(req.getMethod().equalsIgnoreCase("get")) {
			return "/WEB-INF/view/loginForm.jsp";
		} else if (req.getMethod().equalsIgnoreCase("post")) {
			String id = req.getParameter("id");
			String pass = req.getParameter("password");
			req.setAttribute("id", id);
			req.setAttribute("pass", pass);
			
			return "/WEB-INF/view/loginResult.jsp";
		}
		return null;
	}

}
