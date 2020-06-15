<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%@ page import="java.util.List"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.HashMap"%>
<html>
	<head>
		<title>Hello Servlet</title>
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
			integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
			crossorigin="anonymous">
		<link href="./css/home.css" rel="stylesheet" type="text/css">
	</head>
<body>
	<div class"parents" style="margin: 5%">
	<h1>List Students</h1>
	<a href='add'><button class="btn btn-success" type=\"button\">Add
			Student</button></a>

	</br>
	</br>
	<table class="table table-bordered" id="table" style="width: 50%">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Age</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody>
			
				<c:set var="i" value="1" />
				<c:forEach items="${data}" var="student">
			       <tr>
				       <td>${i}</td>
				       <td>${student.id}</td>
				       <td>${student.name}</td>
				       <td>${student.age}</td>
				       <td><a href="edit?id=<c:out value='${student.id}' />">Edit</a> &emsp;
					       <a href="delete?id=<c:out value='${student.id}' />">Delete</a></td>
				
				   </tr>
				   <c:set var="i" value="${i+1}" />
		     	</c:forEach>
		
		</tbody>
	</table>
	</div>

</body>
</html>