<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Successfully Registered</h4>
<table border='1'>
<c:forEach items="${data}" var="post">
<tr>
<td>${post.flightName}</td>
<td>${post.source}</td>
<td>${post.destination}</td>
<td>${post.fare}</td>
<td>${post.noofseats}</td>
<td>${post.aircraftName}</td>
</tr>
</c:forEach>
</table>
</body>
</html>