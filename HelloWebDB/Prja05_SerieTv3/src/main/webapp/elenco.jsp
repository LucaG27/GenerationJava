<%@page import="model.SerieTv"%>
<%@page import="java.util.List"%>

<%@ include file="header.jsp"%>
<%@ include file="menu.jsp"%>
<h1>Genere Serie tv</h1>

<table>
	<tr>
		<th>Serie TV</th>
		<th>Genere</th>
		<th>Descrizione</th>
	</tr>
	<%
List<SerieTv> serie = (List<SerieTv>) request.getAttribute("elencoSerie");
%>

	<%
for(SerieTv s: serie){
%>
	<tr>

		<td><a href="?dettaglio=<%=s.getDescrizione() %>"><%= s.getDescrizione() %></a></td>
		<td><a href="?genere=<%= s.getGenere() %>"><%= s.getGenere() %></a></td>
		<td><%=s.getDescrizione() %></td>
	</tr>
	<% } %>
</table>

<%@ include file="footer.jsp"%>