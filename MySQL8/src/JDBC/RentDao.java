package JDBC;

import java.sql.*;
import java.util.ArrayList;

public class RentDao {
	// 수많은 사용자들이 와서 웹사이트를 실행하면 수많은 RentDao가 만들어진다.
	// 이러한 비효율을 막기 위해 Singleton으로 RentDao 생성
	// Carlander가 대표적인 예 -> 몇십년 몇백년의 데이터를 다 만들면 용량 터진다.
	
	private RentDao() {}
	private static RentDao itc = new RentDao();
	public static RentDao getInstance() {
		return itc;
	}
	
	//Dbman db = new Dbman();   -> 한번만 만드는 객체니 그냥 static으로 쓰자
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<RentDto> selectRent() {
		ArrayList<RentDto> list = new ArrayList<RentDto>();
		con = Dbman.getConnection();

		// view를 미리 만들어줘서 쿼리의 내용을 비약적으로 줄일 수 있었다. 
		String sql = "select * from rentDetail order by numseq desc";
		/*
		CREATE OR REPLACE VIEW rentDetail AS
		SELECT A.NUMSEQ, DATE_FORMAT(A.RENTDATE, '%Y-%m-%d') AS RD, A.BNUM, B.SUBJECT, A.MNUM, C.NAME, B.RENTPRICE, A.DISCOUNT, 
				(B.RENTPRICE - A.DISCOUNT) AS "매출액"
		FROM RENTLIST A, BOOKLIST B, MEMBERLIST C
		WHERE A.BNUM = B.BOOKNUM AND A.MNUM = C.MEMBERNUM;
		 */
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while( rs.next()) {
				RentDto rdto = new RentDto();
				rdto.setNumseq(rs.getInt("numseq"));
				rdto.setRentdate(rs.getString("rd"));
				rdto.setBnum(rs.getInt("bnum"));
				rdto.setSubject(rs.getString("subject"));
				rdto.setMnum(rs.getInt("mnum"));
				rdto.setName(rs.getString("name"));
				rdto.setRentprice(rs.getInt("rentprice"));
				rdto.setDiscount(rs.getInt("discount"));
				rdto.setAmount(rs.getInt("amount"));
				list.add(rdto);
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { Dbman.close(con, pstmt, rs);
		}
		return list;
	}

	public int memberOk(String membernum) {
		int result = 0;
		con = Dbman.getConnection();
		String sql = "select count(*) as cnt from memberlist where membernum = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(membernum));
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt("cnt");
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbman.close(con, pstmt, rs);
		}
		return result;
	}

	public int BookOk(String booknum) {
		int result = 0;
		con = Dbman.getConnection();
		String sql = "select count(*) as cnt from booklist where booknum = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(booknum));
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt("cnt");
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbman.close(con, pstmt, rs);
		}
		return result;
	}

	public int insertRent(RentDto rdto) {
		int result = 0;
		con = Dbman.getConnection();
		String sql = "insert into rentlist(bnum, mnum, discount) values(?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rdto.getBnum());
			pstmt.setInt(2, rdto.getMnum());
			pstmt.setInt(3, rdto.getDiscount());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbman.close(con, pstmt, rs);
		}
		
		return result;
	}
}
