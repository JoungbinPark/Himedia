package JDBC02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


	// Data Access Object
public class BookDao {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String pw = "tiger";
	
	// Connection 및 드라이브 연결 앞단 묶기
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userid, pw);
		} catch (ClassNotFoundException e) {e.printStackTrace();
		} catch (SQLException e) {e.printStackTrace();
		}
		return con;
	}
	
	// Close()를 통한 자원 반환 묶기
	public void close() {
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch(SQLException e) {e.printStackTrace();
		}
	}
	
	// booklist 테이블의 모든 데이터를 리턴해주는 메서드
	//BookDto 에 레코드 하나씩 저장		
	//BookDto들이 ArrayList에 저장되서 리턴 (오라클의 테이블구조와 자바의 구조가 다르기 때문에 이러한 방식이 필요)
	public ArrayList<BookDto> getBooklist() {
		// 데이터 베이스에 연결
		con = getConnection();
		ArrayList<BookDto> list = new ArrayList<BookDto>();
		// 테이블 내용 조회
		String sql = "select * from booklist order by booknum desc";
		
		// 조회 내용을 정리해서 리턴
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BookDto bdto = new BookDto();
				int booknum = rs.getInt("booknum");
				bdto.setBooknum(booknum);
				bdto.setSubject(rs.getString("subject"));
				bdto.setMakeyear(rs.getInt("makeyear"));
				bdto.setInprice(rs.getInt("inprice"));
				bdto.setOutprice(rs.getInt("outprice"));
				bdto.setGrade(rs.getString("grade"));
				list.add(bdto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 데이터베이스 연결 종료
		close();
	
		return list;
	}
	
	
	public int insertBook(BookDto bdto) {
		int result = 0;
		con = getConnection();
		String sql = "insert into booklist(booknum, subject, makeyear, inprice, outprice, grade) "
				+ " values(book_seq.nextVal, ?, ?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bdto.getSubject());
			pstmt.setInt(2, bdto.getMakeyear());
			pstmt.setInt(3, bdto.getInprice());
			pstmt.setInt(4, bdto.getOutprice());
			pstmt.setString(5, bdto.getGrade());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {close();
		}
		
		return result;
	}

	public BookDto getBook(int booknum) {
		BookDto bdto = null;
		con = getConnection();
		String sql = "select * from booklist where booknum = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  booknum);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				bdto = new BookDto();
				bdto.setBooknum(rs.getInt("booknum"));
				bdto.setSubject(rs.getString("subject"));
				bdto.setMakeyear(rs.getInt("makeyear"));
				bdto.setInprice(rs.getInt("inprice"));
				bdto.setOutprice(rs.getInt("outprice"));
				bdto.setGrade(rs.getString("grade"));
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally {close();
		}
		return bdto;
	}

	public int updateBook(BookDto bdto) {
		int result = 0;
		con = getConnection();
		String sql = "update booklist set subject=?, makeyear=?, inprice=?, outprice=?, grade=?" 
				+ " where booknum=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bdto.getSubject());
			pstmt.setInt(2, bdto.getMakeyear());
			pstmt.setInt(3, bdto.getInprice());
			pstmt.setInt(4, bdto.getOutprice());
			pstmt.setString(5, bdto.getGrade());
			pstmt.setInt(6, bdto.getBooknum());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {close();
		}
		
		
		
		return result;
	}

	public int deleteBook(int booknum) {
		int result = 0;
		con = getConnection();
		String sql = "delete from booklist where booknum=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, booknum);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {close();		
		}
		return result;
	}
}
