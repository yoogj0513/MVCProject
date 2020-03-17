package com.yi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.mvc.CommandHandler;

public class PhoneHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		if(req.getMethod().equalsIgnoreCase("get")) {
			return "WEB-INF/view/phoneForm.jsp";
		} else if (req.getMethod().equalsIgnoreCase("post")) {
			
			req.setCharacterEncoding("utf-8");
			
			String os = req.getParameter("phone");
			String company = req.getParameter("company");
			String[] apps = req.getParameterValues("app");
			
			req.setAttribute("os", os);
			req.setAttribute("company", company);
			req.setAttribute("apps", apps);
			
			
			return "WEB-INF/view/phoneResult.jsp";
		}
		
		return null;
	}

}
