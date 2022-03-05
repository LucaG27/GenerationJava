<%@page import="model.SerieTv"%>
<%@page import="java.util.List"%>
<%@ include file ="header.jsp" %>
<%@ include file ="menu.jsp" %>

  <table>
     
     <tr>
     	<th>Nome</th>
     	<th>Genere</th>
     	<th>Descrizione</th>
     	<th>Foto</th>
	</tr>
	<% List<SerieTv> lista =(List<SerieTv>)request.getAttribute("lista"); %>
	<% for (SerieTv s : lista){ %>
	<tr>
		<td><%= s.getNome() %></td>
		<td><%= s.getGenere() %></td>
		<td><%= s.getDescrizione() %></td>

	</tr>
	<% } %>

<%@ include file ="footer.jsp" %>
