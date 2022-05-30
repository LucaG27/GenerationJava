<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Modifica studente <a href="listaStudenti"> Indietro </a>
	<form method="post" action="aggiungiStudente">
		Id: <input type="number" name="id"><br>
		Nome: <input type="text" name="nome"><br>
		Cognome:<input type="text" name="cognome"><br>
		Genere:<input type="text" name="genere"><br>
		Indirizzo:<input type="text" name="indirizzo"><br>
		Città:<input type="text" name="citta"><br>
		Provincia:<input type="text" name="provincia"><br>
		Regione:<input type="text" name="regione"><br>
		Email:<input type="text" name="email"><br>
		Data di Nascita:<input type="date" name="dataNascita"><br>
		<input type="submit" value="Salva">
	</form>

</body>
</html>