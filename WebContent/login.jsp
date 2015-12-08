<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TimesheetAPP</title>
</head>

<body>
<form action="login.do" method="post">
	<center>
	<table cellpadding=4 cellspacing=2 border=0 align="center">
	<tr><th bgcolor="#CCCCFF" colspan=2><font size=5>LOGIN TO ENTER</font><br> 
	<font size=1><sup>*</sup> Required Fields</font></th></tr>

	<tr bgcolor="#c8d8f8">
	<td><input type="radio" name="role" value="Employee" />Employee
		<input type="radio" name="role" value="Manager" />Manager</td></tr>

	<tr bgcolor="#c8d8f8">
	<td valign=top><b>User Name<sup>*</sup></b><br>
	<input type="text" name="UserName"  size=15></td></tr>
	
	<tr bgcolor="#c8d8f8">
	<td valign=top><b>Password<sup>*</sup></b> <br>
		<input type="password" name="Password" size=15></td></tr>

	<tr bgcolor="#c8d8f8">
	<td align=center colspan=2>
		<input type="submit" value="Submit"></tr>
	
	</table>
	</center>
	</form><br> <br> 

<center>
<a href="<%=request.getContextPath()%>/register.jsp"><b>New User - Please Register</b></a>
</center>

</body>
</html>