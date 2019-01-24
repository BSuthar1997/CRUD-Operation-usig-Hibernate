<!Doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>logout Page</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//HTTP 1.1
	    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
		response.setDateHeader("Expires", 0);
	%>
	
	<%
	
	session=request.getSession();

	%>
	<%
	
	if(session!=null){
		
		request.getSession(false);

		session.invalidate();
		response.sendRedirect("index.jsp");
	}
	
	%>
	<div align="center">
		<h1>You have successfully logged out</h1>
		To login again <a href="index.jsp">click here</a>.
	</div>
</body>
</html>