<html>
<head>
<title>Registration Form</title>
<style type="text/css">
h3 {
	font-family: Calibri;
	font-size: 22pt;
	font-style: normal;
	font-weight: bold;
	color: SlateBlue;
	text-align: center;
	text-decoration: underline
}

table {
	font-family: Calibri;
	color: white;
	font-size: 11pt;
	font-style: normal;
	width: 50%;
	text-align:;
	background-color: SlateBlue;
	border-collapse: collapse;
	border: 2px solid navy
}

table.inner {
	border: 0px
}
</style>
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
body {
	background-color: #000006;
}

legend, h3 {
	color: red;
}
</style>
</head>

<body>
	<div class="container">
		<h3>Student Registration Form</h3>
		<form action="RegisterController" method="POST">

			<table align="center" cellpadding="10">
				<tr>
					<td><label>First Name</label></td>
					<td><input type="text" name="firstName" maxlength="30"
						size="30" class="form-control" required /> (max 30 characters a-z
						and A-Z)</td>
				</tr>
				<tr>
					<td><label>Middle Name</label></td>
					<td><input type="text" name="middleName" maxlength="30"
						size="30" class="form-control" required /> (max 30 characters a-z
						and A-Z)</td>
				</tr>

				<tr>
					<td><label>Last Name</label></td>
					<td><input type="text" name="lastName" maxlength="30"
						size="30" class="form-control" required /> (max 30 characters a-z
						and A-Z)</td>
				</tr>

				<tr>
					<td><label>Email</label></td>
					<td><input type="email" name="email" maxlength="100"
						pattern="^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,6}$" size="30"
						class="form-control" required /></td>
				</tr>

				<tr>
					<td><label>User ID</label></td>
					<td><input type="text" name="userId" maxlength="100" size="30"
						class="form-control" required /></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type="password" name="password" maxlength="100"
						size="30" class="form-control" required /></td>
				</tr>

				<tr  align="center">
					<td  align="center"><input type="submit" value="Submit" class="btn btn-danger" /></td>
					<td  align="center"><a href="index.jsp" class="btn btn-primary"> Login </a> </td>
					<td  align="center"><input type="reset" value="Reset" class="btn btn-danger" /></td>
				</tr>

			</table>

		</form>
	</div>
</body>
</html>