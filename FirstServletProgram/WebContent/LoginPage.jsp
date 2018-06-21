<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<body>
<form name ="firstform" action="LoginServlet" method="post">
<label>
User Name : <br>
</label>
<input type="text" name="namebox"/><br>
<label>Password: <br>
</label>
<input type="password" name="password"/><br>
<input type="submit" name="submit" value="Submit"/>
</form>
</body>
</html>