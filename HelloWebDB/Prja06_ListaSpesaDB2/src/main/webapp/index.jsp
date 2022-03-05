<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Benvenuto al supermercato</title>
</head>
<body>

<% 
if (session.getAttribute("email")== null){ //se non ho sessione aperta
	response.sendRedirect("login.jsp"); //va nella JSP di login
    }else{
    	response.sendRedirect("listaSpesa");
    }
%>
</body>
</html>