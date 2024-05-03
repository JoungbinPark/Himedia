package JDBC03;

import java.sql.*;
import java.util.ArrayList;


public class MemberDao {
	
	DataBaseManager dbm = new DataBaseManager();
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public ArrayList<MemberDto> selectMember() {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		con = dbm.getConnection();
		
		String sql = "select * from memberlist";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberDto mdto = new MemberDto();
				mdto.setMembernum(rs.getInt("membernum"));
				mdto.setName(rs.getString("membername"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setBirth(rs.getDate("birth"));			//sql의 DATE 형식인 Java.sql.Date로 전달
				mdto.setBpoint(rs.getInt("bpoint"));
				mdto.setGender(rs.getString("gender"));
				mdto.setAge(rs.getInt("age"));
				list.add(mdto);				
			}
		} catch (SQLException e) {e.printStackTrace();
		}
		dbm.close(con, pstmt, rs);
		return list;
	}


	public int insertMember(MemberDto mdto) {
		// 반환값 설정
		int result = 0;
		// DB 연결
		con = dbm.getConnection();
		//SQL 스트링 생성
		String sql = "insert into memberlist(membernum, membername, phone, birth, age, gender) "
				+ " values(member_seq.nextVal, ?, ?, ?, ?, ?)";
		
		try {
			//pstmt에 sql 세팅
			pstmt = con.prepareStatement(sql);
			
			//pstmt의 ? 공간에 인자로 받아온 값 넣어주기
			pstmt.setString(1, mdto.getName());
			pstmt.setString(2, mdto.getPhone());
			pstmt.setDate(3, mdto.getBirth());
			pstmt.setInt(4, mdto.getAge());
			pstmt.setString(5, mdto.getGender());
			
			// pstmt 실행 및 실행 시 값 받아오기
			result = pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		
			// DB 연결 해제
		} finally {dbm.close(con, pstmt, rs);
		}
		
		
		return result;
	}


	public MemberDto getMember(int membernum) {
		MemberDto mdto = null;
		con = dbm.getConnection();
		String sql = "select * from memberlist where membernum = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, membernum);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mdto = new MemberDto();
				mdto.setMembernum(rs.getInt("membernum"));
				mdto.setName(rs.getString("membername"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setBirth(rs.getDate("birth"));
				mdto.setAge(rs.getInt("age"));
				mdto.setGender(rs.getString("gender"));
				mdto.setBpoint(rs.getInt("Bpoint"));
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { dbm.close(con, pstmt, rs);
		}
		return mdto;
	}


	public int updateMember(MemberDto mdto) {
		int result = 0;
		con = dbm.getConnection();
		String sql = "Update memberlist set membername = ?, phone = ?, birth =?, age =?, bpoint =?, gender=? where membernum =?";

			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, mdto.getName());
				pstmt.setString(2, mdto.getPhone());
				pstmt.setDate(3, mdto.getBirth());
				pstmt.setInt(4, mdto.getAge());
				pstmt.setInt(5, mdto.getBpoint());
				pstmt.setString(6, mdto.getGender());
				pstmt.setInt(7, mdto.getMembernum());
				result = pstmt.executeUpdate();
			} catch (SQLException e) {e.printStackTrace();
			} finally {dbm.close(con, pstmt, rs);		
			}
		return result;
	}


	public int deleteMember(int membernum) {
		int result = 0;
		con = dbm.getConnection();
		String sql = "delete from memberlist where membernum = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, membernum);

			result = pstmt.executeUpdate();
	
		} catch (SQLException e) {e.printStackTrace();
		} finally {dbm.close(con, pstmt, rs);
		}
		return result;
	}
}
