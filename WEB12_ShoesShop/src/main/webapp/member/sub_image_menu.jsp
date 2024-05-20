<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="sub_img">
	<img src="images/member/sub_img.jpg" />
</div>

<div class="sub_page">
	<nav class="sub_menu">	<!-- nav와 article의 부모 시작 -->
		<c:choose>
			<c:when test="${empty loginUser}">
				<div><a href="">LOGIN</a></div>
				<div><a href="">JOIN</a></div>
				<div><a href="" onClick="">Find id/pw</a></div>
			
			</c:when>
			<c:otherwise>
				<div><a href="">update MEMBER</a></div>
				<div><a href="">LOGOUT</a></div>
			</c:otherwise>
		</c:choose>
	</nav>
</div>