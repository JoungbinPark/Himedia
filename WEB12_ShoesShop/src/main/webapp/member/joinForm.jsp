<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<section>
		<%@ include file="sub_image_menu.jsp" %>
		<article>
			<form action="shop.do?command=join" method="post" name="joinForm">
				<h2>Join Us</h2>
				<h3>Basic Info</h3>
				<div class="field">
					<label>User ID</label>
					<div>
						<input type="text" name="userid" size="12" />
						<input type="hidden" name="reid">
						<input type="button" value="중복 체크:" class="dup" onclick="idcheck()"/>
					</div>
				</div>
				<div class="field">
					<label>Password</label><input type="password" name="pwd" />
				</div>
				<div class="field">
					<label>Retype Password</label><input type="password" name="pwdCheck" />
				</div>
				<div class="field">
					<label>Name</label><input type="text" name="name" />
				</div>
				<div class="field">
					<label>Phone</label><input type="text" name="phone" />
				</div>
				<div class="field">
					<label>E-Mail</label><input type="text" name="email" />
				</div>
				<h3>Optional Info</h3>
				<div class="field">
					<label>Zip Code</label>
					<div>
						<input type="text" name="zip_num" readonly />
						<input type="button" onclick="post_zip()" value="우편번호 찾기" />
					</div>
				</div>
				<div class="field">
					<label>Address</label><input type="text" size="50" name="address1" readonly />
				</div>
				<div class="field">
					<label>Detail Address</label><input type="text" name="address2"/>				
				</div>
				
				<div class="btn">
					<input type="button" value="회원가입" onclick="go_save()">
					<input type="button" value="메인으로" onclick="location.href='shop.do?command=index'">
				</div>
			
			</form>
		</article>
	</div>
</section>

<%@ include file="../footer.jsp" %>