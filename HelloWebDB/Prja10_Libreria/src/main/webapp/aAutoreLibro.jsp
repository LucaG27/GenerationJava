<%@ include file="header.jsp" %>

<h2>Aggiungi nuova relazione Autore-Libro </h2>

    <a href="listaAutoriLibri"> Indietro </a>
    
   <form method="post" action="aggiungiAutoreLibro">
        <label>Id Autore: <input type="number" name="alAutoreId" ><br></label>
        <label>Id Libro: <input type="number" name="alLibroId"><br></label>
        <input type="submit" value="Invia">
    </form>


<%@ include file="footer.jsp" %>


