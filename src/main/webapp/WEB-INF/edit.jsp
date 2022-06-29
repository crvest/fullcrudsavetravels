<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<h1>Add an Expense:</h1>
	<form:form action="/expenses/edit/${expense.id}" method="POST" modelAttribute="expense">
		<div>
			<form:input placeholder="Enter a name" path="name"></form:input>
			<form:errors path="name"></form:errors>
		</div>
		
		<div>
			<form:input placeholder="Enter a vendor" path="vendor"></form:input>
			<form:errors path="vendor"></form:errors>
		</div>
		
		<div>
			<form:input placeholder="Enter a amount" path="amount"></form:input>
			<form:errors path="amount"></form:errors>
		</div>
		
		<div>
			<form:input placeholder="Enter a description" path="description"></form:input>
			<form:errors path="description"></form:errors>
		</div>
		
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>