package com.yi.handler.guestbook;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.dao.GuestBookDAO;
import com.yi.jdbc.JDBCUtil;
import com.yi.model.GuestBook;
import com.yi.mvc.CommandHandler;

public class InsertHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		if(req.getMethod().equalsIgnoreCase("get")) {
			return "/WEB-INF/view/guestbook/gbInsertForm.jsp";
		} 
		else if (req.getMethod().equalsIgnoreCase("post")) {
			req.setCharacterEncoding("utf-8");
			
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			String message = req.getParameter("message");
			
			// db연결 > 값 넣기
			Connection conn = null;
			try {
				conn = JDBCUtil.getConnection();
				GuestBookDAO dao = GuestBookDAO.getInstance();
				GuestBook gb = new GuestBook(0, name, password, message);
				dao.insert(conn, gb);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JDBCUtil.close(conn); // 커넥션 풀을 반환
			}
			
			res.sendRedirect("list.do"); // 이동 페이지 직접 처리
			return null; //main controller에서 forward 방지
		}
		return null;
	}

}
