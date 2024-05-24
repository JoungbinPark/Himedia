<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp"%>
<%@ include file="/admin/sub_menu.jsp"%>
<article>
	<form method="post" name="frm">
		<h2>Q & A View</h2>
		<input type="hidden" name="qseq" value="${qnaVO.qseq}" />
		<div class="field" style="border-top: 2px solid blueviolet;">
			<label>작성자</label>
			<div>${qnaVO.userid}</div>
		</div>
		<div class="field" style="border-top: 2px solid blueviolet;">
			<label>제목</label>
			<div>${qnaVO.subject}</div>
		</div>
		<div class="field" style="border-top: 2px solid blueviolet;">
			<label>등록일</label>
			<div>
				<fmt:formatDate value="${qnaVO.indate}" />
			</div>
		</div>
		<div class="field" style="border-top: 2px solid blueviolet;">
			<label>질문내용</label>
			<div>${qnaVO.content}</div>
		</div>
		<div class="field" style="border-top: 2px solid blueviolet;">
			<label>답변내용</label>
			<div style="padding: 10px; align-iteams: center;">
				<c:choose>
					<c:when test="${empty qnaVO.reply }">
						<img src="admin/images/opinionimg01.gif" width="200"
							style="flex: 1">
						<textarea name="reply" rows="3" cols="50"></textarea>
						<input type="button" class="btn" value="저장" onClick="go_rep()">
					</c:when>
					<c:otherwise>
					${qnaVO.reply}
				</c:otherwise>
				</c:choose>

			</div>
		</div>
		<div>
			<input type="button" value="목록으로"
				onClick="location.href='shop.do?command=adminQnaList'">
		</div>
	</form>
</article>
<%@ include file="/admin/footer.jsp"%>