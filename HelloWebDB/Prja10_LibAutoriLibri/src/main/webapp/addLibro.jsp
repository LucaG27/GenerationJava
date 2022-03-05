<%@ include file="bootstrap/header.jsp"%>
<%@ include file="bootstrap/bootstrap.html"%>
<%@ include file="bootstrap/navbar.html"%>

&nbsp;
<h2 class="text-center">Aggiungi un libro alla lista:</h2>
&nbsp;
<div class="mx-auto" style="width: 500px;">
<form method="post" action="aggiungiLibro">
   <div class="container-sm">
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">ID Libro</span>
         <input required type="number" name="libroId" class="form-control" placeholder="35">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Titolo</span>
         <input type="text" name="titolo" class="form-control" placeholder="Il codice da vinci">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Prezzo</span>
          <span class="input-group-text">&euro;</span>
         <input type="number" step="0.01" name="prezzo" class="form-control" placeholder="17,50">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Pagine</span>
         <input type="number" name="pagine" class="form-control" placeholder="359">
      </div>
      <input class="btn btn-outline-dark" type="submit" value="Invia">
      <a class="btn btn-outline-dark" href="listaLibri" role="button">Indietro</a>
   </div>
</form>
</div>
	
<%@ include file="bootstrap/footer.jsp"%>
