package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dbman {
	
	
	// 사용하기 전에 좌측 MySQL에서 Properties -> Java Building Path -> Libraries의 ClassPath에 Jar파일을 add해준다.
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/scott";
	private static String id = "root";
	private static String pw = "adminuser";

	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {e.printStackTrace();
		} catch (SQLException e) {e.printStackTrace();
		}
		return con;
	}
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(con != null)con.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch(SQLException e) { e.printStackTrace();
		}
	}
}
