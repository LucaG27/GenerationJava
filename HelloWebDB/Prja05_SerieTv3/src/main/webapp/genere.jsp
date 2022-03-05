<%@page import="model.SerieTv"%>
<%@page import="java.util.List"%>
<%@ include file="header.jsp"%>
<%@ include file="menu.jsp"%>

<table>

	<tr>
		<th>Genere</th>
		<th>Nome</th>
		<th>Descrizione</th>
		<th>Foto</th>
	</tr>
	<% List<SerieTv> listaGenere =(List<SerieTv>)request.getAttribute("genere"); %>
	<% for (SerieTv s : listaGenere){ %>
	<tr>
        <td><a href="?genere=<%= s.getGenere() %>"><%= s.getGenere() %></a></td>	
		<td><%= s.getNome() %></td>
		<td><%= s.getDescrizione() %></td>

	</tr>
	<% } %>

</table>
<%@ include file="footer.jsp"%>


