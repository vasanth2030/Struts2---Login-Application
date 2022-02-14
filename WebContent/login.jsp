<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<s:form action="loginEval">
<s:textfield key="uname" label="Username"></s:textfield>
<s:password key="pass" label="Password"></s:password>
<s:submit value="Login"></s:submit>

</s:form>

<a href="signup">New User?Signup</a>
</body>
</html>