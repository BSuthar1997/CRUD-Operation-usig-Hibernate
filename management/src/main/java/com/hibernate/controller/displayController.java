package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.dao.DisplayList;
import com.hibernate.model.User;

public class displayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		DisplayList displist = new DisplayList();
		List<User> user = displist.getAll();

		Iterator<User> i = user.iterator();
		out.print("<body bgcolor='green'>");
		out.print("<center>");
		out.print("<h1>Employee Information</h1>" + "To logout <a href=" + "logout.jsp" + ">click here</a>.");
		String msg = (String) request.getAttribute("errmsg");
		if(msg!=null){
		out.println("<h1>" + msg + "! </h1>");
		}
		out.print(
				"<table border='1'><tr><th>Id</th><th>FirstName</th><th>LastName</th><th>MiddleName</th><th>Email</th><th>Update</th><th>Delete</th></tr>");
		while (i.hasNext()) {

			User user1 = (User) i.next();

			out.print("<tr><td>" + user1.getId() + "</td>");

			out.print("<td>" + user1.getFirstName() + "</td>");
			out.print("<td>" + user1.getLastName() + "</td>");
			out.print("<td>" + user1.getMiddleName() + "</td>");
			out.print("<td>" + user1.getEmail() + "</td>");
			out.print("<td>" + "<a href='updateForm.jsp?id=" + user1.getId() + "'> Update</a>" + "</td>");
			out.print("<td>" + "<a href='deleteController?id=" + user1.getId() + "'> Delete</a>" + "</td></tr>");

		}
		out.print("</table>");
		out.print("</center>");
	
		
	
	}

}
