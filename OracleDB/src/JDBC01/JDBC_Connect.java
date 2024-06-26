package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {

	public static void main(String[] args) {
		
		
		// 1. JDBC를 통한 데이터베이스 연결 클래스의 객체 : Connection 생성
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String id = "scott";
		String pw = "tiger";
		Connection con = null;
		
		
		// 외부 장치와의 연결은 항상 예외처리가 따라다닌다. 
		try {
			// 연결될 데이터베이스의 드라이버파일을 지정하는 명령
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName(driver);
			
			//DriverManager 라는 클래스의 스태틱메서드인 getConnection을 이용해서 실제로 DB를 연결하고
			// 연결결과 객체를 con에 저장합니다. 
			//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("데이터베이스에 연결 성공했습니다. ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(con!=null) con.close();
			System.out.println("데이터베이스 종료");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
