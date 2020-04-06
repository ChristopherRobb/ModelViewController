<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>




<body>


<table border="1">

	<tr>
		<td>First Name</td>
		<td>Last Name</td>
		<td>Email</td>
	</tr>
	
	<c:forEach var="tempGuest" items="${guest_list}">
	
		<tr>
		<td>${tempGuest.firstName}</td>
		<td>${tempGuest.lastName}</td>
		<td>${tempGuest.email}</td>
	
	</tr>
	
	
	</c:forEach>


	

</table>

</body>
</html>