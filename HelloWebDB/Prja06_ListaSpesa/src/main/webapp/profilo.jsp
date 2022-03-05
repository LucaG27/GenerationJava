<%@ include file="header.jsp"%>
<%@ include file="nav-bar.jsp"%>
	<h1>Profilo Utente</h1>
	
	<%
		String nome = (String) request.getAttribute("nome");
		String cognome = (String) request.getAttribute("cognome");
		out.print("Ciao " + nome + " " + cognome + ", benvenuto nel nostro sito!<br>");
		
		out.print("Autenticato con: " + request.getSession().getAttribute("email"));
	%>
<%@ include file="footer.jsp"%>