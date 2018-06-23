<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN SIGNUP</title>
</head>
<body>
<form name="adminSignup" action="signUp" method="post">
<label> Employee ID : </label><input type="text" name="empId"><br><br>
<label> Employee Name : </label><input type="text" name="empName"><br><br>
<label> Department : </label>
<select name="dept">
<option value="">SELECT</option>
<option value="ADMIN">ADMIN</option>
<option value="IT">IT</option>
<option value="HR">HUMAN RESOURCE</option>
<option value="SOFTWAREENGINEER">SOFTWARE ENGINEER</option>
</select><br><br>
<label> Date Of Joining : </label>
<input type="date" name="doj" value="">
<br><br>
<label> User Active : </label><select name="userActive">
<option value="">SELECT</option>
<option value="Y">YES</option>
<option value="N">NO</option><br><br>
</select><br>
<br>
<label> Password : </label><input type="password" name="password"><br>
<input type="submit" name="Flight" value="BOOK FLIGHT"><br>
 
</form>
</body>
</html>