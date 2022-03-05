<%@ include file="header.jsp" %>

<h2>Aggiungi Libro </h2>
	<a href="listaLibri"> Indietro </a>
	<form method="post" action="aggiungiLibro">
		<label>Id: <input type="number" name="id"><br></label>
		<label>Titolo: <input type="text" name="titolo"><br></label>
		<label>Prezzo: <input type="number" name="prezzo"><br></label>
		<label>Pagine: <input type="number" name="pagine"><br></label>
		
		<input type="submit" value="Salva">
</form>

<%@ include file="footer.jsp" %>