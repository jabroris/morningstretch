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
<title>Greenhouse</title>
<style type="text/css">
.tg {
	border-collapse:collapse;
	border-spacing:0;
	border-color:#ccc; 
	cellpadding:10;
	cellspacing:10;}
.tg td {
	font-family:Arial, sans-serif;
	font-size:14px;
	padding:10px 5px;
	border-style:solid;
	border-width:1px;
	overflow:hidden;
	word-break:normal;
	border-color:#ccc;
	color:#333; 
	cellpadding:10;
	cellspacing:10;}
.tg th {
	font-family:Arial, sans-serif;
	font-size:14px;
	font-weight:normal;
	padding:10px 5px;
	border-style:solid;
	border-width:1px;
	overflow:hidden;
	word-break:normal;
	border-color:#ccc;color:#333;
	background-color:#f0f0f0; 
	cellpadding:10;
	cellspacing:10;}
.tg .tg-4eph{background-color:#f9f9f9}
a.button {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 10px 15px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 15px;
	margin: 10px 15px 10px 8px;
	}
a.btn{
	background-color: #f44336;
	border: none;
	color: white;
	padding: 10px 15px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 15px;
	margin: 10px 15px 10px 8px;
	}
.table {
	border: 1px;
	}
.th { width:10%;}
.value {margin: 10px 15px 10px 8px;}
</style>

</head>
<body>
	<h1>
		Add a Greenhouse
	</h1>
	<c:url var="addAction" value="/greenhouse/add" ></c:url>
	<form:form action="${addAction}" commandName="greenhouse">
		<table>
			<c:if test="${!empty greenhouse.name}">
				<tr>
					<td>
						<form:label path="id">
							<spring:message text="ID"/>
						</form:label>
					</td>
					<td>
						<form:input path="id" readonly="true" size="8" disabled="true" />
						<form:hidden path="id" />
					</td>
				</tr>
			</c:if>
				<tr>
					<td>
						<form:label path="name">
							<spring:message text="Name"/>
						</form:label>
					</td>
					<td>
						<form:input path="name" />
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="review">
							<spring:message text="Review"/>
						</form:label>
					</td>
					<td>
						<form:input path="review" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<c:if test="${!empty greenhouse.name}">
							<input type="submit" value="<spring:message text="Edit Greenhouse"/>"/>
						</c:if>
						<c:if test="${empty greenhouse.name}">
						<input type="submit" value="<spring:message text="Add Greenhouse"/>" />
						</c:if>
					</td>
				</tr>
		</table>
	</form:form>
	<br>
	<h3>Greenhouses List</h3>
	<c:if test="${!empty listGreenhouses}">
		<table class="tg">
			<tr>
				<th width="80">ID</th>
				<th width="120">Greenhouse Name</th>
				<th width="120">Review</th>
				<th width="60">Action</th>
			</tr>
			<c:forEach items="${listGreenhouses}" var="greenhouse">
				<tr>
					<td>${greenhouse.id}</td>
					<td>${greenhouse.name}</td>
					<td>${greenhouse.review}</td>
					<td><a href="<c:url value='/edit/${greenhouse.id}' />" class="button">Edit</a>
					<a href="<c:url value='/remove/${greenhouse.id}' />" class="btn">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>