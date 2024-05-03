package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Select {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String id = "scott";
		String pw = "tiger";
		Connection con = null;
		
		//SQL 명령을 담고 실행해서 결과를 얻어오는 클래스
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			//System.out.println("데이터베이스에 연결 성공했습니다. ");
			
			// SQL문을 String 형식으로 작성 후 변수에 저장합니다. 
			String sql = "select * from customer";
			
			//String변수 sql에 담긴 SQL명령을 연결된 객체 con과 함께 pstmt에 장착합니다. 
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			System.out.println("번호\t이름\t\t이메일\t\t전화번호");
			System.out.println("----------------------------------------");
			
			
			
			//rs.next();	저장된 결과가 rs에 담겨있는동안 현재 위치에서 다음레코드로 이동했을 때 
			//				다음레코드가 있다면 true, 없으면 false를 리턴하는 메서드 
			
			while(rs.next()) {
				// rs.getInt() : number형 필드값을 추출하는 메서드. 괄호안에 필드이름을 정확히 써야합니다. 
				// rs.getString() : varchar2형 필드값을 추출하는 메서드
				// 모든 자료형에 대해 get~() 메서드가 존재
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				System.out.printf("%d\t%s\t\t%s\t%s\n", num, name, email,tel);
				/*
				 정수를 표시하는 위치에는 %d를 사용하고, 이후에는 탭 문자(\t)를 사용하여 일정한 간격을 만듭니다.
				 문자열을 표시하는 위치에는 %s를 사용하고, 두 개의 탭 문자(\t\t)를 사용하여 더 큰 간격을 만듭니다.
				 문자열 마지막에는 개행 문자(\n)를 사용하여 줄을 바꿉니다.
				 */
				
				
				
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(con!=null) con.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
