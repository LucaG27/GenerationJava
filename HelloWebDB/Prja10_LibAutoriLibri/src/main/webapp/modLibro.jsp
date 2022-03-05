<%@ include file="bootstrap/header.jsp"%>
<%@ include file="bootstrap/bootstrap.html"%>
<%@ include file="bootstrap/navbar.html"%>
&nbsp;
<h2 class="text-center">Modifica il libro:</h2>
&nbsp;
<div class="mx-auto" style="width: 500px;">
<form method="post" action="modificaLibro">
   <div class="container-sm">
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">ID Libro</span>
         <input readonly type="number" name="id" class="form-control" placeholder="35" aria-label="35" aria-describedby="basic-addon1" value="<%=request.getAttribute("id")%>">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Titolo</span>
         <input type="text" name="titolo" class="form-control" placeholder="il codice da vinci libro" aria-label="Mario" aria-describedby="basic-addon1" value="<%=request.getAttribute("titolo")%>">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Prezzo</span>
          <span class="input-group-text">&euro;</span>
         <input type="number" step="0.01" name="prezzo" class="form-control" placeholder="17,50" aria-label="Rossi" aria-describedby="basic-addon1" value="<%=request.getAttribute("prezzo")%>">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Pagine</span>
         <input type="number" name="pagine" class="form-control" placeholder="359" aria-label="US" aria-describedby="basic-addon1" value="<%=request.getAttribute("pagine")%>">
      </div>
      <input class="btn btn-outline-dark" type="submit" value="Invia">
      <a class="btn btn-outline-dark" href="listaAutori" role="button">Indietro</a>
   </div>
</form>
</div>

<%@ include file="bootstrap/footer.jsp"%>