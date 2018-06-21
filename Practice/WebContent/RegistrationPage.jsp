<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Flights</title>
<h2>BOOK FLIGHTS</h2>
</head>
<body>
<form name="bookFlight" action="bookFlight" method="post">
<label> FLIGHT NAME : </label><input type="text" name="flightName"><br>
<label> SOURCE : </label>
<select name="src">
<option value="">SELECT</option>
<option value="MAA">CHENNAI</option>
<option value="HYD">HYDERBAD</option>
<option value="VIZAG">VISHAKAPATNAM</option>
</select><br>
<label> DESTINATION : </label>
<select name="dst">
<option value="">SELECT</option>
<option value="DELHI">DELHI</option>
<option value="MAA">CHENNAI</option>
<option value="VIZAG">VISHAKAPATNAM</option>
</select>
<br>
<label> FARE : </label><input type="text" name="fare"><br>
<label> NO.OF.SEATS : </label><input type="text" name="noofseats"><br>
<label> AIRCRAFT NAME : </label><input type="text" name="aircraftName"><br>
<input type="submit" name="Flight" value="BOOK FLIGHT"><br>
 
</form>
</body>
</html>