<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>01_setCookie.jsp</title>
</head>
<body>
<!-- 쿠키
	웹사이트 접속 시 접속자의 개인장치에 다운로드되고 브라우저에 저장되는 텍스트 데이터
	웹사이트는 쿠키를 통해 접속자의 장치를 인식하고 접속자의 설정과 과거 이용내역에 대한 일부 데이터 저장
	쿠키에는 만료일이 있다.
	브라우저를 닫을 때 자동삭제되는 쿠기가 있을 수 있으며 수동삭제 전까지 남아있는 쿠키도 있다. 
 -->
 
<!-- 쿠키의 사용
	필수쿠키 : 페이지 탐색 웹사이트의 보안 영역 접속 그리고 검색을 포함한 웹사이트의 기본기능을 활성화할 목적으로 사용
	기능쿠키 : 웹사이트가 접속자의 지역 및 언어 등 웹사이트의 행태 및 외관에 영향을 줄 수 있는 접속자 설정을 정장하도록 허용. 접속자 설정에 따라 웹사이트가 작동하도록 도움을 줌
	성능쿠키 : 정보의 익명 수집 및 보고를 통해 웹사이트 운영자가 방문자와 웹사이트 사이의 상호작용을 이해하는 데 도움을 주고 유저와 상호관계에 대한 통계자료를 제공함으로써 운영자가 최적화된 웹사이트 개발을 하는 데에 기여
	
 -->
<%
// 1. Cookie 객체 생성
Cookie c = new Cookie("id", "hong123");

// 2. 쿠키의 유효기간 설정
c.setMaxAge(365*24*60*60);	//1년 간의 쿠키 수명 설정 -> 초단위 숫자 설정

// 3. 클라이언트에 쿠키 전송
response.addCookie(c);

// 4. new 쿠키를 생성하여 클라이언트에 바로 전송
response.addCookie(new Cookie("pwd", "test1234"));
response.addCookie(new Cookie("age", "20"));
%>
<!--
서버 저장객체 : pageContext, session, request, application
클라이언트 저장객체 : Cookie
 -->




</body>
</html>