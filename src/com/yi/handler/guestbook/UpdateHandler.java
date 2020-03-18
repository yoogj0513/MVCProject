package com.yi.handler.guestbook;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.dao.GuestBookDAO;
import com.yi.jdbc.JDBCUtil;
import com.yi.model.GuestBook;
import com.yi.mvc.CommandHandler;

public class UpdateHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		if(req.getMethod().equalsIgnoreCase("get")) {
			Connection conn = null;
			String sId = req.getParameter("id");
			int id = Integer.parseInt(sId);
			
			try {
				conn = JDBCUtil.getConnection();
				GuestBookDAO dao = GuestBookDAO.getInstance();
				GuestBook gb = dao.selectById(conn, id); //임시코드로 1만 가져옴
				req.setAttribute("gb", gb);
				return "/WEB-INF/view/guestbook/gbUpdateForm.jsp";
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(conn);
			}
		}
		else if (req.getMethod().equalsIgnoreCase("post")) {
			req.setCharacterEncoding("utf-8");
			String sId = req.getParameter("id");
			String name = req.getParameter("name");
			String message = req.getParameter("message");
			String password = req.getParameter("password");
			
			int id = Integer.parseInt(sId);
			Connection conn = null;
			try {
				conn = JDBCUtil.getConnection();
				GuestBookDAO dao = GuestBookDAO.getInstance();
				
				// 비밀번호가 일치 하는가?
				GuestBook dbGuestBook = dao.selectById(conn, id);
			
				// 일치하지 않으면, updateForm으로 다시 감.
				if(dbGuestBook.getPassword().equals(password) == false) {
					req.setAttribute("gb", dbGuestBook);
					req.setAttribute("error", "notMatchPassword"); // 키의 값은 무엇이 들어가는 상관 없음. 키가 있는가를 판단하기 위해서 생성
					return "/WEB-INF/view/guestbook/gbUpdateForm.jsp";
				}
				
				// 일치하면 db update 처리
				GuestBook gb = new GuestBook(id, name, password, message);
				dao.update(conn, gb);
				
				res.sendRedirect("list.do");
				return null; //forward가 안되게 막음
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JDBCUtil.close(conn);
			}
		}
		return null;
	}

}
