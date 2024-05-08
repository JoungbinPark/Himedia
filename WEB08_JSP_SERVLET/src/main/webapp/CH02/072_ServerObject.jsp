<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>072_ServerObject.jsp</title>
</head>
<body>
<h1>
second의 pageContext 속성 : <%=pageContext.getAttribute("name") %><br>
second의 request 속성 : <%=request.getAttribute("name") %><br>
second의 session 속성 : <%=session.getAttribute("name") %><br>
second의 application 속성 : <%=application.getAttribute("name") %><br>
</h1>

<!-- 객체의 수명
	pageContext : 현재페이지까지
	request : forward 또는 다른 방식으로 전송되는 페이지까지
	session : 브라우저가 닫힐 때까지
	application : 서버가 꺼지거나 리셋될 때까지


 -->



</body>
</html>