<%@ include file="bootstrap/header.jsp"%>
<%@ include file="bootstrap/bootstrap.html"%>
<%@ include file="bootstrap/navbar.html"%>
&nbsp;
<h2 class="text-center">Inserisci gli ID per creare una relazione autore-libro:</h2>
&nbsp;
<div class="mx-auto" style="width: 500px;">
<form method="post" action="aggiungiAutoreLibro">
   <div class="container-sm">
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">ID autore</span>
         <input type="number" required name="autoreId" class="form-control" placeholder="35">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">ID libro</span>
         <input type="number" name="libroId" class="form-control" placeholder="22">
      </div>
      <input class="btn btn-outline-dark" type="submit" value="Invia">
      <a class="btn btn-outline-dark" href="listaAutori" role="button">Indietro</a>
   </div>
</form>
</div>

<%@ include file="bootstrap/footer.jsp"%>
