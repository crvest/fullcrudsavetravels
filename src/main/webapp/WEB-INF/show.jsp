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
	<title>Show Expense</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<div class="flex space-between">
		<h1>Expense Details</h1>
		<a href="/expenses">Go back</a>
	</div>
	
	<p>Expense Name: <c:out value="${expense.name}"></c:out></p>
	<p>Expense Description: <c:out value="${expense.description}"></c:out></p>
	<p>Vendor: <c:out value="${expense.vendor}"></c:out></p>
	<p>Amount Spent: <c:out value="${expense.amount}"></c:out></p>
</body>
</html>