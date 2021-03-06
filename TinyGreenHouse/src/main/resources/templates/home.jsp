<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tiny Greenhouse</title>
<style type="text/css">
.tg {
	border-collapse:collapse;
	border-spacing:0;
	border-color:#ccc;}
.tg td {
	font-family:Arial, sans-serif;
	font-size:14px;padding:10px 5px;
	border-style:solid;
	border-width:1px;
	overflow:hidden;
	word-break:normal;
	border-color:#ccc;
	color:#333;
	background-color:#fff;}
.tg th {
	font-family:Arial, sans-serif;
	font-size:14px;
	font-weight:normal;
	padding:10px 5px;
	border-style:solid;
	border-width:1px;
	overflow:hidden;
	word-break:normal;
	border-color:#ccc;
	color:#333;
	background-color:#f0f0f0;}
.tg .tg-4eph {
	background-color:#f9f9f9}
</style>

</head>
<body>
	<h1>Welcome</h1>
	<p>${message}<br/>
	<a href="${pageContext.request.contextPath}/greenhouses">Click here to generate the Greenhouse List</a><br/>
	</p>

</body>
</html>