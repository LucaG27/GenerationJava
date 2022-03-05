<%@ include file="header.jsp" %>

<body>
Modifica Libro <a href="listaAutori"> Indietro </a>
	<form method="post" action="updAutore">
		<!-- <label>Id: <input type="number" name="id" hidden value="<%=request.getAttribute("id")%>"><br></label> -->
		<label>Nome: <input type="text" name="nome" value="<%=request.getAttribute("nome")%>"><br></label>
		<label>Cognome: <input type="text" name="cognome" value="<%=request.getAttribute("cognome")%>"><br></label>
		<label>Nazionalita: <input type="text" name="nazionalita" value="<%=request.getAttribute("nazionalita")%>"><br></label>
		
		<input type="submit" value="Salva">

</form>
</body>
<%@ include file="footer.jsp" %>