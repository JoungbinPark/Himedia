<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.net.URLEncoder" %>
<%
	//JSP 문법에 의한 로그인 체크 동작만 필요한 페이지이므로 별도의 HTML 태그는 사용하지 않는다
	//전달된 ID/PWD 유효성을 점검 후 로그인 성공페이지로 이동하거나, 로그인페이지로 되돌아감
	
	//전달된 아이디 비번을 변수에 저장
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//실제로는 데이터베이스에 저장된 회원정보와 전송된 ID/PWD을 비교해 로그인처리하지만 지금은 그냥 특정 ID/PWD와 비교
	if(id.equals("scott")&& pwd.equals("1234")){
		//JSP문법으로 페이지 이동은 response.sendRedirect();
		response.sendRedirect("053_Login_OK.jsp?id="+id+"&name="+ URLEncoder.encode("홍길동","UTF-8"));
		//한글문자가 URL에 가면 깨지므로 URLEncoder를 임포트해서 사용해준다
	}else{
		//아이디 비번이 맞지 않은 경우
		response.sendRedirect("051_Login.jsp");
	}

%>
