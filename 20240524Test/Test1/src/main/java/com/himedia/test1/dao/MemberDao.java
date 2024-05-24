package com.himedia.test1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.himedia.test1.dto.MemberDto;
import com.himedia.test1.util.Db;

public class MemberDao {
	
	private MemberDao() {}
	private static MemberDao itc = new MemberDao();
	public static MemberDao getInstance() { return itc; }
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public MemberDto getMember(String userid) {
		MemberDto mdto = new MemberDto();
		con = Db.getConnection();
		String sql = "select * from member where userid=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mdto.setUserid(rs.getString("userid"));
				mdto.setPwd(rs.getString("pwd"));
				mdto.setName(rs.getString("name"));

			}
		} catch (SQLException e) { e.printStackTrace();
		} finally { Db.close(con, pstmt, rs);
		}
		return mdto;
	}
}
