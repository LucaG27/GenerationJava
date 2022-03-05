<%@ include file="header.jsp" %>

<h2>Aggiungi Autore </h2>
    <a href="listaAutori"> Indietro </a>
    <form method="post" action="aggiungiAutore">
        <label>Id: <input type="number" name="id"><br></label>
        <label>Nome: <input type="text" name="nome"><br></label>
        <label>Cognome: <input type="text" name="cognome"><br></label>
        <label>Nazionalità: <input type="text" name="nazionalita"><br></label>
        <input type="submit" value="Invia">
    </form>

<%@ include file="footer.jsp" %>