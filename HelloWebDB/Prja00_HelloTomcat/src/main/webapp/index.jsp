<%@page import="model.Libro"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Sono index.jsp </h1>
	<%
		String s = "Hello world";
	
	List<String> note = new ArrayList<>();
	note.add("do");
	note.add("re");
	note.add("mi");
	note.add("fa");
	note.add("sol");
	note.add("la");
	note.add("si");
	
	Libro l = new Libro("La vita è bella");
	
			out.print("<ul>");
		for(int i = 0; i < note.size(); i++) {
			out.print("<li>"+note.get(i)+"</li> " + s);
		}
			out.print("</ul>");
	
		
		
	%>
	
	<h2><%= s %></h2>
	
<script src="dino.js"></script>
</body>
</html>