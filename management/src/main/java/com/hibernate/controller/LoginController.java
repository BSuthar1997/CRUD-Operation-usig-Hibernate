package com.hibernate.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.constant.Constant;
import com.hibernate.model.User;
import com.hibernate.service.LoginService;

public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter(Constant.userName);
		String password = request.getParameter(Constant.password);
		LoginService loginService = new LoginService();
		
		boolean result = loginService.authenticateUser(userId, password);
		User user = loginService.getUserByUserId(userId);
		if (result == true) {
			request.setAttribute("errmsg","Your Login Was successful");
			RequestDispatcher rd = request.getRequestDispatcher("display");
			rd.forward(request, response);
		} else {
			response.sendRedirect("error.jsp");
		}
	}

}