package com.himedia.test1.controller.action;

import java.io.IOException;

import com.himedia.test1.dao.MemberDao;
import com.himedia.test1.dto.MemberDto;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserloginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userid = request.getParameter("id");
		String pwd =  request.getParameter("pass");
		
		MemberDao mdao = MemberDao.getInstance();
		MemberDto mdto = mdao.getMember(userid);
		
		String url = "test.do?command=index";
		if(mdto==null) {
			request.setAttribute("msg", "아이디가 없습니다.");
		} else if(!mdto.getPwd().equals(pwd)) {
			request.setAttribute("msg", "비밀번호가 틀립니다.");
		} else if(mdto.getPwd().equals(pwd)) {
			request.setAttribute("lUser", mdto);
			request.setAttribute("msg", "접속 성공");
			url="test.do?command=main";
		} else {
			request.setAttribute("msg", "예상치 못한 오류발생. 관리자 문의바랍니다.");
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
