package com.himedia.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class joinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public joinServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String gender = request.getParameter("gender");
			String content = request.getParameter("content");
			
			//배열을 받을 떈 
			String [] item = request.getParameterValues("item");
			String job = request.getParameter("job");
			
			request.setAttribute("id", id);
			request.setAttribute("pwd", pwd);
			if(gender.equals("1")) request.setAttribute("gender", "남성");
			else request.setAttribute("gender", "여성");
			
			request.setAttribute("content", content);
			
			//새로배열을 만들어 반복문으로 기존배열을 조회하며 넣는다
			String [] itemName = new String[item.length];
			for(int i=0; i<item.length; i++) {
				switch(item[i]) {
				case "1" : itemName[i] = "신발"; break;
				case "2" : itemName[i] = "가방"; break;
				case "3" : itemName[i] = "벨트"; break;
				case "4" : itemName[i] = "모자"; break;
				}
			}
			request.setAttribute("item", itemName);

			switch(job) {
			case "1" : request.setAttribute("job", "학생"); break;
			case "2" : request.setAttribute("job", "컴퓨터/인터넷"); break;
			case "3" : request.setAttribute("job", "언론"); break;
			}
			
			if(id.equals("scott") && pwd.equals("1234")) {
				RequestDispatcher rd = request.getRequestDispatcher("CH02/092_Join_OK.jsp");
				rd.forward(request, response);
			} else {
				response.sendRedirect("CH02/091_JSP_ServletEx.jsp");
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
