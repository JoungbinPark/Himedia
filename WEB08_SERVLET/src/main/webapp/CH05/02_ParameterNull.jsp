<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_ParameterNull.jsp</title>
</head>
<body>

<h3>JSP 코드 : <%=request.getParameter("id") %></h3>
<h3>EL 코드 : ${ param.id }</h3>
<%-- 
서버객체 .getAttribute()는 ${저장KEY}로 추출 가능하고
파라미터 .getParameter(name값)은 ${ param.name값} 으로 추출가능
 --%>
 
 <%
/*  	if( request.getParameter("id").equals("scott")){
 		out.print("<h1> scott님이 로그인하셨습니다. </h1>");
 	} */
 		//위 코드는 request.getParameter("id")가 Null일 경우 에러
 		//equals 메서드가 null값을 받을 때 오류를 발생시키기 때문
 %>
 
 <br><br>

 <%
	//위와 같은 에러를 방지하기 위해 아래와 같은 연산을 사용
 	if(request.getParameter("id") != null){
 		if( request.getParameter("id").equals("scott")){
 	 		out.print("<h1> scott님이 로그인하셨습니다. </h1>");
 		} 
 	}else {
			out.print("<h1>id가 null 값입니다.</h1>");
		}
 %>
 
 <br><br>
 <hr>
 <h2>
 EL을 이용한 null과의 비교<br>
 '=='연산자 사용결과 : <br>\${ param.id =="hong" } -> ${ param.id =="hong" } 
 <br>\${ param.id eq "hong" } -> ${ param.id eq "hong" } 
 </h2>
<br><br><br>

</body>
</html>