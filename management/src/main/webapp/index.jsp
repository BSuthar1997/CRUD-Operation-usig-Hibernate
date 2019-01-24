<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<style type="text/css">
body, html {
	height: 100%;
	background-color: #111111;
}

* {
	box-sizing: border-box;
}
legend{
color:red;
}
/* Add styles to the form container */
.container1 {
	position: fixed;
	right: 0;
	margin: 20px;
	max-width: 300px;
	padding: 16px;
}
</style>
</head>
<body>
	<div class="container">
		<div align="center">
			<%
				if (request.getAttribute("msg") != null) {
			%>
			<p style="color: red">
				<%=request.getAttribute("msg")%>
			</p>
			<%
				}
			%>
			<%
				if (request.getAttribute("msg2") != null) {
			%>
			<p style="color: green;">
				<%=request.getAttribute("msg2")%>
			</p>
			<%
				}
			%>
		</div>
		<fieldset>
			<legend class="legend">Login</legend>
			<form action="login" method="post" class="form-control">
				<table cellpadding="3pt">
					<tr>
						<td>User Name :</td>
						<td><input type="text" name="userName" size="30"
							class="form-control" required /></td>
					</tr>
					<tr>
						<td>Password :</td>
						<td><input type="password" name="password" size="30"
							class="form-control" required /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Login"
							class="btn btn-primary" /></td>
					</tr>
				</table>
				<p />
				New User? <a href="register.jsp" style="margin-left: 30px;">Register
					Here</a>
			</form>
		</fieldset>
	</div>
</body>
</html>