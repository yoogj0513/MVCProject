package com.yi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.mvc.CommandHandler;

public class JoinHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		if(req.getMethod().equalsIgnoreCase("get")) {
			return "WEB-INF/view/joinForm.jsp";
		} else if (req.getMethod().equalsIgnoreCase("post")) {
			req.setCharacterEncoding("utf-8");
			
			String name = req.getParameter("name");
			String birthday = req.getParameter("birthday");
			String tel = req.getParameter("tel");
			
			req.setAttribute("name", name);
			req.setAttribute("birthday", birthday);
			req.setAttribute("tel", tel);
			
			return "WEB-INF/view/joinResult.jsp";
		}
		return null;
	}

}
