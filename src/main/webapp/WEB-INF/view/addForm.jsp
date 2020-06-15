<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div style="margin: 5%">
		<h1>Add Student Form</h1>

		<form class="form-group" action="<%=request.getContextPath()%>/add"
			method="POST" style="width: 50%;">
			ID: <input class="form-control" type="text" name="id"><br>
			Name: <input class="form-control" type="text" name="name"> <br>
			Age: <input class="form-control" type="text" name="age"><br>
			<input class="btn btn-success" type="submit" value="Save"
				style="margin-top: 30px; width: 100%">
		</form>
	</div>

</body>
</html>