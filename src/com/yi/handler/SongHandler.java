package com.yi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.mvc.CommandHandler;

public class SongHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		if(req.getMethod().equalsIgnoreCase("get")) {
			return "WEB-INF/view/songForm.jsp";
		} else if (req.getMethod().equalsIgnoreCase("post")) {
			req.setCharacterEncoding("utf-8");
			
			String[] songs = req.getParameterValues("song");
			req.setAttribute("songs", songs);
			
			return "WEB-INF/view/songResult.jsp";
		}
		
		return null;
	}

}
