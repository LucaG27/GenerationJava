<%@ include file="header.jsp" %>

<body>
Modifica Libro <a href="listaLibri"> Indietro </a>
	<form method="post" action="updLibro">
		<!--<label>Id: <input type="number" name="id" hidden value="<%=request.getAttribute("id")%>"><br></label>-->
		<label>Titolo: <input type="text" name="titolo" value="<%=request.getAttribute("titolo")%>"><br></label>
		<label>Prezzo: <input type="number" name="prezzo" value="<%=request.getAttribute("prezzo")%>"><br></label>
		<label>Pagine: <input type="number" name="pagine" value="<%=request.getAttribute("pagine")%>"><br></label>
		
		<input type="submit" value="Salva">

</form>
</body>
<%@ include file="footer.jsp" %>