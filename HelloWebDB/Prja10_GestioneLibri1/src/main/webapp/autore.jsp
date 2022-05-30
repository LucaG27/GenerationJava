<%@page import="model.Autore"%>
<%@page import="java.util.List"%>
 <%@ include file="bootstrap/header.jsp"%>
 <%@ include file="bootstrap/bootstrap.html"%>
 <%@ include file="bootstrap/navbar.html"%>
 
	<table class="table table-striped">
	<tr> 
		<th class="table-light">ID</th>	
		<th class="table-light">Nome</th>
		<th class="table-light">Cognome</th>
		<th class="table-light">Nazionalità</th>	
		<th class="table-light">Elimina</th>	
		<th class="table-light">Modifica</th>	
	</tr>
 		<%	List<Autore> lista = (List<Autore>) request.getAttribute("listaAutori"); %>
		<% if(lista!=null){
			for(Autore l : lista){ %>
				<tr>
				<td><%=l.getId() %></td>
				<td><%=l.getNome() %></td>
				<td><%=l.getCognome() %></td>
				<td><%=l.getNazionalita() %></td>
                <td>
				<form method = "post" action="delAutore?idAutore=<%= l.getId() %>">
				<input type="submit" value="Elimina">
				</form></td>
		        <td>
				<form method ="get" action="modificaAutore">
				<input type="text" hidden name="modificaId" value="<%= l.getId() %>">
				<input type="submit" value="Modifica">
				</form> </td>
				</tr>
		<%	}
		}else{
			out.print("<br> Non ci sono autori in lista <br>");
		}  %>
	</table>
 <%@ include file="bootstrap/alertContainer.jsp"%>
 <%@ include file="bootstrap/footer.jsp"%>