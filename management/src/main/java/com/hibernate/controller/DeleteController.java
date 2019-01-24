package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.hibernate.dao.DeleteUser;

public class DeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(DeleteController.class);

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doPost(req, resp);
	}

	@SuppressWarnings("unused")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		DeleteUser deleteuser = new DeleteUser();
		deleteuser.deleteUserData(id);
		req.setAttribute("errmsg", " Deletion complete !");
		RequestDispatcher rd = req.getRequestDispatcher("/display");
		rd.forward(req, resp);

	}

}
