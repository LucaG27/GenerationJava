<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		int op1 = 5;
		if(op1 % 2 == 0) {
	%>
	
		<jsp:forward page="utente.jsp" />
	
	<%
		} else { 
	%>
	
		<jsp:forward page="index.jsp" />
	
	<%
		}
	%>
</body>
</html>