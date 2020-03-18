package com.yi.handler.guestbook;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.dao.GuestBookDAO;
import com.yi.jdbc.JDBCUtil;
import com.yi.model.GuestBook;
import com.yi.mvc.CommandHandler;

public class ListHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			conn = JDBCUtil.getConnection();
			GuestBookDAO dao = GuestBookDAO.getInstance();
			List<GuestBook> list = dao.list(conn);
			req.setAttribute("list", list);
			
			return "/WEB-INF/view/guestbook/gbList.jsp";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn);
		}
		return null;
	}

}
