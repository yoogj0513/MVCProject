package com.yi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.mvc.CommandHandler;

public class ChoiceDogHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		if(req.getMethod().equalsIgnoreCase("get")) {
			return "WEB-INF/view/choiceDogForm.jsp";
		} else if (req.getMethod().equalsIgnoreCase("post")) {
			req.setCharacterEncoding("utf-8");
			
			String[] dogs = req.getParameterValues("dog");
			
			req.setAttribute("dogs", dogs);
			return "WEB-INF/view/choiceDogResult.jsp";
		}
		
		return null;
	}

}
