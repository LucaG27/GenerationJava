<%@page import="model.Libro"%>
<%@page import="java.util.List"%>
<%@ include file="bootstrap/header.jsp"%>
<%@ include file="bootstrap/bootstrap.html"%>
<%@ include file="bootstrap/navbar.html"%>
	<table class="table table-striped">
	<tr> 
		<th class="table-light">ID</th>	
		<th class="table-light">Titolo</th>
		<th class="table-light">Prezzo</th>
		<th class="table-light">Pagine</th>	
		<th class="table-light">Elimina</th>	
		<th class="table-light">Modifica</th>	
	</tr>
 		<%	List<Libro> lista = (List<Libro>) request.getAttribute("listaLibro"); %>
		<% if(lista!=null){
			for(Libro l : lista){ %>
				<tr>
				<td><%=l.getId() %></td>
				<td><%=l.getTitolo() %></td>
				<td><%=l.getPrezzo() %>&euro;</td>
				<td><%=l.getPagine() %></td>
                <td>
				<form method = "post" action="cancellaLibro?deleteId=<%= l.getId() %>">
				<input type="submit" value="Elimina">
				</form></td>
		        <td>
				<form method ="get" action="modificaLibro">
				<input type="text" hidden name="modificaId" value="<%= l.getId() %>">
				<input type="submit" value="Modifica">
				</form> </td>
				</tr>
				
		<%	}
		}else{
			out.print("<br> Non ci sono libri in lista <br>");
		}  %>
	</table>
 
 <%@ include file="bootstrap/alertContainer.jsp"%>
 <%@ include file="bootstrap/footer.jsp"%>