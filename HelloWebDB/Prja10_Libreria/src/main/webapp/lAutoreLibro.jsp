<%@page import="model.AutoreLibro"%>
<%@page import="java.util.List"%>
<%@ include file="header.jsp" %>

<body>
 <div><a href="home.jsp">Indietro</a></div> 
  <div><a href="aggiungiAutoreLibro">Aggiungi relazione Autore-Libro</a></div> 
	<table>
	<tr> 
		<th> ID Autore </th>	
		<th> ID Libro </th>	
		<th> Cognome Autore </th>
		<th> Titolo Libro </th>
		<th> Prezzo Libro </th>
	</tr>
 
	<%
 		List<AutoreLibro> lista = (List<AutoreLibro>) request.getAttribute("listaAutoriLibri");
		if(lista!=null){
			for(AutoreLibro p : lista){
				out.print("<tr>");
				out.print("<td>" + p.getAlAutoreId() + "</td>");
				out.print("<td>" + p.getAlLibroId() + "</td>");
				out.print("<td>" + p.getaCognome() + "</td>");
				out.print("<td>" + p.getlTitolo() + "</td>");
				out.print("<td>" + p.getlPrezzo() + "</td>");
 
			out.print("<td>" + 
							"<form method = \"post\" action=\"delAutoreLibro?deleteId=" + p.getAlAutoreId() + "\">" +
							"<input type=\"submit\" value=\"Elimina\"></input>" +
							"</form> </td>");
				out.print("</tr>");
			}
		}else{
			out.print("<br> Non ci sono autoriLibri in lista <br>");
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