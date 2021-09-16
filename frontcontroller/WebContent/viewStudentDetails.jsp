<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" content="text/html; charset-UTF-8">
<title>Student Details</title>
</head>
<body>

	Student Id:
	<jsp: getProperty property="id" name="studentDetails" scope = "request"/>
	Student Name:
	<jsp: getProperty property="name" name="studentDetails" />

</body>
</html>