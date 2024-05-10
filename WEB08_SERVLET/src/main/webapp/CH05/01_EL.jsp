<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>01_EL.jsp</title>
</head>
<body>
<!-- 표현 언어(EL, Expression language)
	JSP의 전달값이나 변수값 등 자료를 출력할 때의 번거로움을 간단히 해결하기 위해서 만들어진 출력문법
	JSP문법을 HTML5에서 더 구분하기 쉽고, 오류를 줄여서 운용하기 위해 개발된 언어.
	주로 pageContext, request, session, application에 전달되는 Attribute의 값을 getter를 이용하지 않고 출력할 때 많이 사용
 -->
<h3>
JSP 문법 사용 1 : <%="Hello" %><br>
JSP 문법 사용 2 : <% out.println("Hello"); %><br>
EL 문법 사용 : ${"Hello" }
</h3>

<%
request.setAttribute("name", "홍길동");
%>


<h3>
JSP 문법 사용 1 : <%=request.getAttribute("name") %><br>
JSP 문법 사용 2 : <% out.println(request.getAttribute("name")); %><br>
EL 문법 사용 : ${name }
</h3>
<br><br>
<h3>
정수형 : ${10}<br>
실수형 : ${5.6} <br>
문자열형 : ${"홍길동"} <br> 
논리형 : ${true} <br>
null : ${null} <br>
</h3>


<br><br>
<h3>
<!-- 산술연산 -->
10과 2의 합 : ${ 10 + 2 }<br>
\${ 10 - 2 } = ${10 - 2}<br> <!-- \$를 하면 연산을 안하고 모양 그대로 출력 -->
\${ 10 * 2 } = ${10 * 2}<br>
\${ 10 / 2 } = ${10 / 2}<br>
\${ 10 % 3 } = ${10 % 3}<br>
\${ 10 mod 3 } = ${10 mod 3}<br>
</h3>

<h3>
<!-- 관계연산(비교연산) -->
\${10==2} = ${10==2}<br>
\${10 eq 2} = ${10 eq 2}<br>
\${10 != 2 } = ${10 != 2}<br>
\${10 ne 2 } = ${10 ne 2}<br>
\${10 < 2 } = ${10 < 2 }<br>
\${10 lt 2 } = ${10 lt 2 }<br>
\${10 > 2 } = ${10 > 2 }<br>
\${10 gt 2 } = ${10 gt 2 }<br>
\${10 <= 2 } = ${10 <= 2 }<br>
\${10 le 2 } = ${10 le 2 }<br>
\${10 >= 2 } = ${10 >= 2 }<br>
\${10 ge 2 } = ${10 ge 2 }<br>
\${empty("") } = ${empty("") } <br>
</h3>

<br><br>
<h3>
\${"2"+5 } = ${ "2" + 5}<br>
\${"2"+"5" } = ${ "2" + "5"}<br>
\${"2" * 5 } = ${ "2" * 5}<br>
\${null+5 } = ${ null + 5}<br>
</h3>
<br><br><br><br>

<h3>
<!-- 문자열 연결(EL 3.0) 추가  -->
\${ "문자" += "열" += "연결" } = ${ "문자" += "열" += "연결" }<br>
</h3>
<br><br><br><br>

<!-- 서버 객체의 내용을 getAttribute 메서드 없이 사용 -->
<%
pageContext.setAttribute("name1", "홍길동");
request.setAttribute("name2", "홍길남");
session.setAttribute("name3", "홍길서");
application.setAttribute("name4", "홍길북");
%>
<h3>
JSP문법(request) : <%= request.getAttribute("name2") %><br>
JSP문법(request) : <% String str = (String) request.getAttribute("name2"); %>
<%=str%><br>
</h3>
<h3>
EL 문법 : ${name1}<br>
EL 문법 : ${name2}<br>
EL 문법 : ${name3}<br>
EL 문법 : ${name4}<br>
</h3>
<%-- 
EL을 이용할 때 서버객체의 내용을 출력하고자 할 때, 어떤 객체인지 명시하지 않고, 애트리뷰터 이름만 사용했다면
사용하려는 애트리뷰트가 있는 객체를 순서대로 검사하여 가장 먼저 발견된 내용을 출력
pageContext -> request -> session -> application
name이라는 애트리뷰트를 가지고 있는 객체중에서 순서적으로 가장 우선인 객체내용이 출력됨
 --%>



<br><br><br><br><br><br><br><br>
</body>
</html>