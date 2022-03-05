<%@page import="model.Prodotto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="header.jsp"%>
<%@ include file="nav-bar.jsp"%>
<table>

	<tr>
		<th>Nome</th>
		<th>Prezzo</th>
		<th>Reparto</th>
		<th>Azioni</th>
	</tr>

	<% List<Prodotto> lista =(List<Prodotto>)request.getAttribute("lista");%>
	<% double totale = 0; %>
	
	<% for (Prodotto p : lista){ %>
	<tr>
		<td><%= p.getNome()%></th>
		<td><%= p.getPrezzo()%></th>
		<td><%= p.getCategoria()%></th>
		<td>
			<form method="post" action="removeProdotto?id=
					<%=p.getId()%>">
				<input type="submit"><i class="fa fa-trash"></i>
			</form>
		</th>
		<% totale += p.getPrezzo();%>
	</tr>
	<% } %>
	<tr>
		<td><b>Totale =</b></td>
		<td><%= totale %></td>
	
	</tr>
</table>
	<a href="carrello">Paga ora</a>

<%@ include file="footer.jsp"%>