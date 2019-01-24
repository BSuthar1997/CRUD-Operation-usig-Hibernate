package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.hibernate.dao.UpdateUser;
import com.hibernate.model.User;


public class FetchController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(FetchController.class);

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String id = request.getParameter("id");

		id = id.replaceAll("/", "");
		out.print(id);

		String email = request.getParameter("email");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String middleName = request.getParameter("middleName");
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		User user = new User(firstName, middleName, lastName, email, userId, password);

		
		UpdateUser updateuser = new UpdateUser();

		updateuser.updateUserData(id, user);

		request.setAttribute("errmsg", "update complete");
		RequestDispatcher rd = request.getRequestDispatcher("/display");
		rd.forward(request, response);
		

	}
}
