<%@ include file="header.jsp" %>
<%@ include file ="menu.jsp" %>

<h1>Aggiungi Serie TV</h1>

<form action="aggiungiSerie" method="post">
<input type="text" name= "nome" placeholder="Scrivi il nome della serie tv">
<input type="text" name= "genere" placeholder="Scrivi il nome del genere">
<input type="text" name= "descrizione" placeholder="Scrivi una descrizione">
<input type="text" name= "foto" placeholder="Aggiungi l'url della foto">
<input type="submit" value= "Add Serie">
</form>


<%@ include file="footer.jsp" %>