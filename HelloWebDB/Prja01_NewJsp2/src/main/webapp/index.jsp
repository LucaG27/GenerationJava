<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> ciao </h1>
<jsp:useBean id="calc" class="bean.Calcolatrice"></jsp:useBean>

<% out.print(calc.hello());
%>

</body>
</html>