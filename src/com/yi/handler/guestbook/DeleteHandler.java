package com.yi.handler.guestbook;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.dao.GuestBookDAO;
import com.yi.jdbc.JDBCUtil;
import com.yi.model.GuestBook;
import com.yi.mvc.CommandHandler;

public class DeleteHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		if(req.getMethod().equalsIgnoreCase("get")) {
			String sId = req.getParameter("id");
			req.setAttribute("id", sId);
			return "/WEB-INF/view/guestbook/gbDeleteForm.jsp";	
		}
		else if (req.getMethod().equalsIgnoreCase("post")) {
			req.setCharacterEncoding("utf-8");
			String sId = req.getParameter("id");
			String password = req.getParameter("pass");
			
			int id = Integer.parseInt(sId);
			Connection conn = null;
			
			try {
				conn = JDBCUtil.getConnection();
				GuestBookDAO dao = GuestBookDAO.getInstance();
				
				GuestBook dbGuestBook = dao.selectById(conn, id);
				
				if(dbGuestBook.getPassword().equals(password) == false) {
					req.setAttribute("id", id); // id값을 다시 실어서 보내줘야함
					req.setAttribute("error", "notMatchPassword");
					return "/WEB-INF/view/guestbook/gbDeleteForm.jsp";
				}
					
				dao.delete(conn, id);
				
				res.sendRedirect("list.do");
				return null;
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JDBCUtil.close(conn);
			}
			
		}
		return null;
	}

}
