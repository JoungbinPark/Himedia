<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>안녕하세요</h2>	
	<h2>JAVA SERVER PAGE(JSP)</h2>
	<!-- 
	JSP는 JAVA SERVER PAGE의 약자로, 웹페이지 내부에 프로그래밍적 요소를 추가하거나
	서버에서 계산되고 실행된 결과를 웹페이지에서 표시하고자 할 때 사용합니다. 
	쉽게 얘기하자면 웹페이지 HTML5 중간중간에 자바 프로그래밍 코드를 좀 같이 쓰겠습니다라는 뜻과 비슷합니다. 
	사용 예시는 아래와 같습니다. (날짜 변수 d의 선언과 객체 초기화 동작)
	 -->
	 <script type = "text/javascript">
	 //자바스크르비트 명령 작성 - 브라우저에 내장되어있는 자바스크립트 실행프로그램이 실행
	 //클라이언트에서 실행
	 alert("자바스크립트에서 실행되었습니다.");
	 </script>
	 <%
	 //JSP 명령 작성 - 서버에서 자바프로그램 실행기가 실행
	 //서버에서 실행됨
	 java.util.Date d = new java.util.Date();
	 %>
	 <h2>현재시간 : <%=d %></h2>
	 
	 <!-- 
	 HTML로 페이지를 구성하던 중, JSP에 의한 컨텐츠가 중간에 나와야 한다면 필요한 곳에 JSP 명령을 씁니다. 
	 현재 JSP 파일 안에 HTML 문법사이로 JSP문법이 껴들어 코딩할 때는 <% %>을 사용합니다. 
	 -->
	  
	  
	  
	 <!-- JSP 명령 사용법 -->
	 <%--HTML 내에서 JSP 명령이 섞인 구문을 주석처리하는 기호 --%>
	 <%--
	 	<% JSP 명령 %> : 명령의 실행
	 	<% 변수 또는 출력 내용 %> : 웹페이지에 출력
	  --%>
	 
	 
	 <!-- 
	 JSP명령은 HTML태그와 함께 파일로 저장되어 서버에 보관됩니다.
	 클라이언트의 요청을 받으면 해당 파일(~.jsp)를 클라이언트로 전송되어 웹브라우저에 표시하는데
	 그 전에 jsp명령은 이미 실행되어서 결과만 html태그와 같이 전송되어집니다.
	  -->
	 
</body>
</html>