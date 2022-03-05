<%@page import="model.Libro"%>
<%@page import="java.util.List"%>
<%@ include file="header.jsp" %>

<body>

 <a href="home.jsp">Indietro</a>
 <a href="aggiungiLibro">Aggiungi Libro</a>
	<table>
	<tr> 
		<th>ID</th>	
		<th>Titolo</th>
		<th>Prezzo</th>
		<th>Pagine</th>	
	</tr>
 
	<%
 		List<Libro> lista = (List<Libro>) request.getAttribute("listaLibri");
		if(lista!=null){
			for(Libro p : lista){
				out.print("<tr>");
				out.print("<td>" + p.getId() + "</td>");
				out.print("<td>" + p.getTitolo() + "</td>");
				out.print("<td>" + p.getPrezzo() + "</td>");
				out.print("<td>" + p.getPagine() + "</td>");
 
			out.print("<td>" + 
							"<form method = \"post\" action=\"delLibro?idLibro=" + p.getId() + "\">" +
							"<input type=\"submit\" value=\"Elimina\"></input>" +
							"</form> </td>");
			out.print("<td>" + 
						"<form method = \"get\" action=\"updLibro\">"+
						"<input type=\"text\" hidden name=\"modificaId\" value=\""+p.getId()+ "\" >" +
						"<input type=\"submit\" value=\"Modifica\"></input>" +
						"</form> </td>");
				out.print("</tr>");
			}
		}else{
			out.print("<br> Non ci sono libri in lista <br>");
		}
 
 
	%>
 
	</table>
 
	<% 
	String msg=(String)request.getAttribute("avvisoMessaggio");
	if(msg!=null){
		out.print("<script>alert(\""+msg+"\");</script>");
	}
	%>
 
 
		<%@ include file="footer.jsp" %>