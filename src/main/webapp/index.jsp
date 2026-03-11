<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hibernate Crud operation</title>
</head>
<body>
	<h1>Insert Data into Table Using Hibernate</h1>
	<form action="InsertData" method="get">
	Enter Employee Id:<input type="text" name="t1"/><br/>
	Enter Employee Name:<input type="text" name="t2"/><br/>
	Enter Employee Salary:<input type="text" name="t3"/><br/>
	<input type="submit" value="INSERT"/>
	</form>
</body>
</html>