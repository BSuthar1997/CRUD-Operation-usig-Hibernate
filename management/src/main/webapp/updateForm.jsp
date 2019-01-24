<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UpdateForm</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<%
	String id = request.getParameter("id");
%>
<body>
	<div class="container">
		<form action="FetchController" method="post">

			<input type="hidden" name="id" value=<%=id%> />
			<div class="form-group">
				<label for="email">Email address:</label> <input type="email"
					class="form-control" id="email" name="email"
					pattern="^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,6}$">
			</div>
			<div class="form-group">
				<label for="fname">First Name:</label> <input type="text"
					class="form-control" id="fname" name="firstName">
			</div>
			<div class="form-group">
				<label for="lname">Last Name:</label> <input type="text"
					class="form-control" id="lname" name="lastName">
			</div>
			<div class="form-group">
				<label for="mname">Middle Name:</label> <input type="text"
					class="form-control" id="mname" name="middleName">
			</div>
			<div class="form-group">
				<label for="uid">User Id:</label> <input type="text"
					class="form-control" id="uid" name="userId">
			</div>
			<div class="form-group">
				<label for="pwd">PassWord:</label> <input type="password"
					class="form-control" id="pwd" name="password">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>