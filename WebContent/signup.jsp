<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup Page</title>
</head>
<body>

	<s:form action="signupEval">
		<s:textfield key="uname" label="Username"></s:textfield>
		<s:password key="pass" label="Password"></s:password>
		<s:password key="confirmPass" label="Confirm password"></s:password>
		<s:submit value="Signup"></s:submit>
	</s:form>
	
	<a href="login">Login?</a>
</body>
</html>