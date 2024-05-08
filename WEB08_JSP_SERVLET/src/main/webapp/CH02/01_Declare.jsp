<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>01_Declare.jsp</title>
<!-- 
	JSP는 실행영역과 선언부영역으로 구분됩니다. 
	보통 실행영역은 body 안에서 <% %>으로 표시된 곳에 기술
	선언부는 head ㅜ분에서 <%! %>로 표시된 곳에 대부분 기술
 -->
 <%!
 	//선언부의 시작 : 선언부의 영역은 변수, 메서드 등이 정의됨
 	//변수선언
 	String str = "안녕하세요!";
 	int a = 5, b = -5;
 	//메서드 정의
 	public int abs(int n){
 		if(n<0) n=-n;	// n=-1*n
 		return n;
 	}	//jsp의 메서드는 static으로 선언하지 않아도 사용이 가능

 %>
 

</head>
<body>
<%
	int c = 10;
	c++;
	a++;
%>

<h2>
str변수 : <%=str %><br>
a변수 : <%=a %><br>
c변수 : <%=c %><br></h2>
	<!-- 새로고침을 하면 a의 값만 1씩 증가한다 -> a는 전역변수라 생명력이 길다 -->
</body>
</html>