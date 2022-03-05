<%@page import="model.Prodotto"%>
<%@page import="java.util.List"%>
<%@ include file="header.jsp"%>
<%@ include file="nav-bar.jsp"%>
<h1>Checkout</h1>
<h2>Totale da pagare : ${totaleCarrello}</h2>
<form method="post" action="carrello">
	<input type="number" step=0.01 name="sommaPagare"> 
	<input type="submit" value="paga">
</form>
<%@ include file="footer.jsp"%>