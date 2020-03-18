package com.yi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yi.jdbc.JDBCUtil;
import com.yi.model.GuestBook;

public class GuestBookDAO {
	private static GuestBookDAO dao = new GuestBookDAO(); // 싱글톤 처리
	
	
	public static GuestBookDAO getInstance() {
		return dao;
	}
	
	private GuestBookDAO() {} // 외부 생성 막음
	
	public int insert(Connection conn, GuestBook gb) throws SQLException {
		
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into guestbook values (null,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gb.getName());
			pstmt.setString(2, gb.getPassword());
			pstmt.setString(3, gb.getMessage());
			return pstmt.executeUpdate();
		} finally {
			JDBCUtil.close(pstmt);
		}
	}
	
	public List<GuestBook> list(Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from guestbook";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ArrayList<GuestBook> list = new ArrayList<>();
			while(rs.next()) {
				GuestBook gb = new GuestBook(rs.getInt(1), 
											rs.getString(2), 
											rs.getString(3), 
											rs.getString(4));
				list.add(gb);
			}
			return list;
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
	}
	
	public GuestBook selectById(Connection conn, int id) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from guestbook where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				GuestBook gb = new GuestBook(rs.getInt(1), 
											rs.getString(2), 
											rs.getString(3), 
											rs.getString(4));
				return gb;
			}
			return null;
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
	}
	
	public int update(Connection conn, GuestBook gb) throws SQLException { // id, name, message
		PreparedStatement pstmt = null;
		
		try {
			String sql = "update guestbook set name = ?, message = ? where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gb.getName());
			pstmt.setString(2, gb.getMessage());
			pstmt.setInt(3, gb.getId());
			return pstmt.executeUpdate();
		} finally {
			JDBCUtil.close(pstmt);
		}
	}	
}
