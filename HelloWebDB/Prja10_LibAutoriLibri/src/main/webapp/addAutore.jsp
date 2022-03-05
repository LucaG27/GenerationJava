<%@ include file="bootstrap/header.jsp"%>
<%@ include file="bootstrap/bootstrap.html"%>
<%@ include file="bootstrap/navbar.html"%>
&nbsp;
<h2 class="text-center">Aggiungi un autore alla lista:</h2>
&nbsp;
<div class="mx-auto" style="width: 500px;">
<form method="post" action="aggiungiAutore">
   <div class="container-sm">
      <div class="input-group mb-3">
         <span  class="input-group-text" id="basic-addon1">ID Autore</span>
         <input required type="text" name="autoreId" class="form-control" placeholder="35">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Nome</span>
         <input type="text" name="nome" class="form-control" placeholder="Dan">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Cognome</span>
         <input type="text" name="cognome" class="form-control" placeholder="Brown">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Nazionalità</span>
         <input type="text" name="nazionalita" class="form-control" placeholder="US">
      </div>
      <input class="btn btn-outline-dark" type="submit" value="Invia">
      <a class="btn btn-outline-dark" href="listaAutori" role="button">Indietro</a>
   </div>
</form>
</div>
<%@ include file="bootstrap/footer.jsp"%>
