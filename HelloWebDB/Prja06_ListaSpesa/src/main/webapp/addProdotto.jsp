<%@ include file="header.jsp"%>
<%@ include file="nav-bar.jsp"%>
<form method="post" action="aggiungiProdotto">
	<input type="text" name="nome"> 
	<input type="number" step=0.01 name="prezzo">
	<input type="text" name="reparto">
	<input type="submit" value="Aggiungi!">
</form>
<%@ include file="footer.jsp"%>