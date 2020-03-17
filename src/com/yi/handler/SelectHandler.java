package com.yi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.mvc.CommandHandler;

public class SelectHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		if(req.getMethod().equalsIgnoreCase("get")) {
			return "selectForm.jsp";
		} else if (req.getMethod().equalsIgnoreCase("post")) {
			String site = req.getParameter("site");
			req.setAttribute("result", site);
			return "selectReulst.jsp";
		}
		return null;
	}

}
