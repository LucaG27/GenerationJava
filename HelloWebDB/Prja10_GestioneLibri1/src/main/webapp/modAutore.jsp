<%@ include file="bootstrap/header.jsp"%>
<%@ include file="bootstrap/bootstrap.html"%>
<%@ include file="bootstrap/navbar.html"%>
&nbsp;
<h2 class="text-center">Modifica l'autore:</h2>
&nbsp;
<div class="mx-auto" style="width: 500px;">
<form method="post" action="modificaAutore">
   <div class="container-sm">
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">ID Autore</span>
         <input readonly type="text" name="autoreId" class="form-control" placeholder="35" aria-label="35" aria-describedby="basic-addon1"value="<%=request.getAttribute("id")%>">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Nome</span>
         <input type="text" name="nome" class="form-control" placeholder="Dan" aria-label="Mario" aria-describedby="basic-addon1"value="<%=request.getAttribute("nome")%>">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Cognome</span>
         <input type="text" name="cognome" class="form-control" placeholder="Brown" aria-label="Rossi" aria-describedby="basic-addon1"value="<%=request.getAttribute("cognome")%>">
      </div>
      <div class="input-group mb-3">
         <span class="input-group-text" id="basic-addon1">Nazionalità</span>
         <input type="text" name="nazionalita" class="form-control" placeholder="US" aria-label="US" aria-describedby="basic-addon1"value="<%=request.getAttribute("nazionalita")%>">
      </div>
      <input class="btn btn-outline-dark" type="submit" value="Invia">
      <a class="btn btn-outline-dark" href="listaAutori" role="button">Indietro</a>
   </div>
</form>
</div>
<%@ include file="bootstrap/footer.jsp"%>
