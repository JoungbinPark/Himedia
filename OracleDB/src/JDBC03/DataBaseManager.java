package JDBC03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseManager {
	
	//DataBase에서의 드라이버, 커넥션 연결 등의 역할을 맡은 클래스
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String pw = "tiger";
	
	// DB와 연결
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

	// DB와 연결 종료
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch(SQLException e) {e.printStackTrace();
		}
	}
}
