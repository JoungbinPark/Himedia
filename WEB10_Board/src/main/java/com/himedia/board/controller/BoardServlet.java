package com.himedia.board.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.himedia.board.controller.action.Action;
import com.himedia.board.controller.action.member.JoinFormAction;
import com.himedia.board.controller.action.member.LoginAction;
import com.himedia.board.controller.action.member.LoginFormAction;

/**
 * Servlet implementation class BoardServlet
 */
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String command = request.getParameter("command");
		if( command == null) System.out.println(" 1. command 전달 오류");
		else System.out.println("command : " + command);
		
		Action ac = null;
		ActionFactory af = ActionFactory.getInstance();
		ac = af.getAction(command);
		if( ac==null) System.out.println(" 2. Action 전달 오류");
		ac.execute(request, response);
		/*
		if( command.equals("loginForm")) {
			// member/loginForm.jsp로 포워딩하는 코드
			//RequestDispatcher rd = request.getRequestDispatcher("member/loginForm.jsp");
			//rd.forward(request, response);
			
			//LoginFormAction lfa = new LoginFormAction();
			//lfa.execute(request, response);
			ac = new LoginFormAction();
		}else if (command.equals("login")) {
			// DB를 이용하여 로그인처리 하는 코드
			ac = new LoginAction();
		}else if (command.equals("joinForm")) {
			// member/joinForm.jsp로 포워딩하는 코드
			//RequestDispatcher rd = request.getRequestDispatcher("member/loginForm.jsp");
			//rd.forward(request, response);
			ac = new JoinFormAction();
		}else if ( command.equals("join")) {
			//DB를 이용하여 회원가입 처리하는 코드
		}
		ac.execute(request, response);
		*/
			
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
