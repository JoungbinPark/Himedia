package com.himedia.board;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.himedia.board.controller.action.Action;
import com.himedia.board.controller.action.LoginAction;
import com.himedia.board.controller.action.LoginFormAction;

public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BoardServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String command = request.getParameter("command");
		System.out.println("command : " + command);
		Action ac = null;
		
/* 원래라면 LoginFormAction에 해당하는 객체 lfa를 만들고 그 객체에 execute를 해줘야한다.
 * 그러나 Action 인터페이스를 공유하는 특성을 활용해서
 * ac 객체 하나만 생성한 뒤 그 객체에 참조시키는 방식으로
 * 코드를 단순화시킬 수 있다. 
 *  
 *  */
		if(command.equals("loginForm")) {
			ac = new LoginFormAction();
		}else if(command.equals("login")) {
			ac = new LoginAction();
		}
		ac.execute(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
