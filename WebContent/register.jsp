<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SIGNING UP</title>
</head>

<body bgcolor = cyan>

 <form action="register.do" method="post">
 	<font face="geneva" color="red" size="3">Registration Home</font><br>
	<font face="geneva" color="black" size="3">
	<b>Employee/Manager Information: All information must be filled.</b></font><br> 
		<input type="radio" name="role" value="Employee" />Employee
		<input type="radio" name="role" value="Manager" />Manager
		
		<br><font face="geneva" color="black" size="3">
			User Name*:<br> <input type="text" name="UserName"><br>
			Password*:<br> <input type="password" name="Password"><br>
			First Name*:<br> <input type="text" name="fname"><br>
			Last Name*<br> <input type="text" name="lname"><br>
			<input type="submit" value="Submit">
			
		</font> </form>

</body>
</html>