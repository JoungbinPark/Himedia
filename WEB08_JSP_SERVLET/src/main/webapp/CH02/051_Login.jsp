<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>051_Login.jsp</title>
</head>
<body>
	<form method="post" action="052_Login_do.jsp">
		<label for="id">아이디 : </label><input type="text" name="id" /> <br />
		<label for="pwd">암 &nbsp; 호 : </label><input type="password" name="pwd" /> <br />
		<input type="submit" value="로그인">
	</form>
	<!-- 
	1. 로그인 순서
		아이디와 암호 입력 후 submit 버튼 클릭
		-> 입력된 아이디와 암호가 서버로 전송
		-> 전송된 아이디로 데이터베이스 검색
		-> 검색 결과에 따라 로그인 실패 또는 성공을 나눠서 프론트에서 표시	
		: 검색된 아이디가 없으면 "아이디가 없습니다."
		  검색된 아이디는 있는데 암호가 틀리면 "암호가 틀립니다."
		  아이디도 있고 암호도 일치하면 "로그인 성공"
		  
	2. 아이디와 암호의 검색 및 검증은 보통 서버 내부에서 JAVA 프로그래밍으로 이루어짐
	
	3. 자바프로그래밍을 할 수 있게 해주는 주체를 흔히 서블릿이라고 한다. 
	
	4. 보통 form의 action에는 로그인검증을 담당하는 서블릿을 지정한다.
	
	5. 서블릿은 웹용 클래스라고 생각해도 무방하다. 
	
	6. 지금은 서블릿도 웹클래스도 학습하지 않은 상태라서 그 역할을 052_Login_do.jsp파일이 하도록 한다
	   DB연동도 학습전이니 유효한 ID/PWD는 scott/1234로 한다.
	
	-->

</body>
</html>