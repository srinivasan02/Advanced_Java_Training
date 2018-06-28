<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <form:form method="POST"  modelattribute="user" action="formSubmit">
<table>
    <tr>
        <td>username</td>
        <td><form:input path="username" name="username"/></td>
    </tr>
    <tr>
        <td>password:</td>
        <td><form:password path="password" name ="password"/></td>
    </tr>
    <tr>
 		<form:button id="register" name="register">Register</form:button>
 	</tr>	
 	</table>
 	</form:form>
 	 --%>
 	
 <form:form modelAttribute="SpringMvcModel" method ="post" action="registerProcess">
<table>
<tr>
<td><form:label path="username">Username</form:label></td>
<td><form:input path="username" name="username" id="username" />
</td>
</tr>
<tr>
<td><form:label path="password">Password</form:label></td>
<td><form:password path="password" name="password"
id="password" /></td>
</tr>
<tr>
<td><form:button id="register" name="register">Register</form:button>
</td>
</tr>

</table>
</form:form>
 	

</body>
</html>