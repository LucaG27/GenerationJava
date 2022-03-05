<%@page import="model.AutoreLibro"%>
<%@page import="java.util.List"%>
<%@ include file="bootstrap/header.jsp"%>
<%@ include file="bootstrap/bootstrap.html"%>
<%@ include file="bootstrap/navbar.html"%>
	<table class="table table-striped">
	<tr> 
		<th class="table-light">ID Autore</th>	
		<th class="table-light">ID Libro</th>
		<th class="table-light">Cognome</th>
		<th class="table-light">Titolo</th>	
		<th class="table-light">Prezzo</th>	
		<th class="table-light">Elimina</th>	
	</tr>
 		<%	List<AutoreLibro> lista = (List<AutoreLibro>) request.getAttribute("listaAutoriLibri"); %>
		<% if(lista!=null){
			for(AutoreLibro al : lista){ %>
				<tr>
				<td><%=al.getAlAutoreId() %></td>
				<td><%=al.getAlLibroId() %></td>
				<td><%=al.getaCognome() %></td>
				<td><%=al.getlTitolo() %></td>
				<td><%=al.getlPrezzo() %>&euro;</td>
                <td>
				<form method = "post" action="cancellaAutoreLibro?deleteId=<%= al.getAlLibroId()%>">
				<input type="submit" value="Elimina">
				</form></td>
				</tr>
		<%	}
		}else{
			out.print("<br> Non ci sono relazioni autore-libro in lista <br>");
		}  %>
	</table>
 <%@ include file="bootstrap/alertContainer.jsp"%>
 <%@ include file="bootstrap/footer.jsp"%>