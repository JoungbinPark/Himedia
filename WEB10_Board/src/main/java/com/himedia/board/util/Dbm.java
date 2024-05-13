package com.himedia.board.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dbm {
	
   static String driver = "com.mysql.cj.jdbc.Driver";
   static String url = "jdbc:mysql://localhost:3306/board";
   static String id="root";
   static String pass="adminuser";
   
   //연결객체를 return 하는 메서드
   public static Connection getConnection() {
	   Connection con = null;
	   try {
		Class.forName(driver);
		con = DriverManager.getConnection(url, id, pass);
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	   return con;
   }
   
   // 전달받은 객체를 close하는 메서드
   public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
	   try {
		   if(con!=null) con.close();
		   if(pstmt!=null) pstmt.close();
		   if(rs!=null)rs.close();
	   }catch(SQLException e) {e.printStackTrace();}
	   
   }
   
}
