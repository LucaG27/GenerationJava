

	function flushModal(){
		document.getElementById('id').value = "";
		document.getElementById('nome').value = "Casual";
		document.getElementById('cognome').value = "Value";
		document.getElementById('telefono').value = "454654";
		document.getElementById('email').value = "brorbo@gmail.com";
		document.getElementById('indirizzo').value = "Via pappa 15";
		document.getElementById('citta').value = "Napoli";
		document.getElementById('provincia').value = "NA";
		document.getElementById('regione').value = "Campania";
		document.getElementById('credito').value = "1200";
}

/*-----------------------------------------------------------------------*/

function saveCliente(){//sia salvataggio che modifica

fetch("http://localhost:8080/api/saveCliente" , {
method: "POST",
headers: new Headers({ "Content-Type" : "application/json" }),
body: JSON.stringify(
	{
		id: document.getElementById('id').value,
		nome: document.getElementById('nome').value,
		cognome: document.getElementById('cognome').value,
		telefono: document.getElementById('telefono').value,
		email: document.getElementById('email').value,
		indirizzo: document.getElementById('indirizzo').value,
		citta: document.getElementById('citta').value,
		provincia: document.getElementById('provincia').value,
		regione: document.getElementById('regione').value,
		credito: document.getElementById('credito').value
	}
)

})
.then(response => response.text())
.then(text => alert(text))
.then(ricarica => redirect())
.catch(errore => alert(errore))
}

/*-----------------------------------------------------------------------*/

function getClienteById(id) {//recupero cliente da modificare e lo inserisco nel form

fetch("http://localhost:8080/api/getClienteById/" + id, {
method: "GET"
})
.then(response => response.json())
.then(cliente => {
	document.getElementById('id').value = cliente.id,
	document.getElementById('nome').value = cliente.nome,
	document.getElementById('cognome').value = cliente.cognome,
	document.getElementById('telefono').value = cliente.telefono,
	document.getElementById('email').value = cliente.email,
	document.getElementById('indirizzo').value = cliente.indirizzo,
	document.getElementById('citta').value = cliente.citta,
	document.getElementById('provincia').value = cliente.provincia,
	document.getElementById('regione').value = cliente.regione,
	document.getElementById('credito').value = cliente.credito
})
}

/*-----------------------------------------------------------------------*/

function deleteCliente(id) {

fetch("http://localhost:8080/api/deleteCliente/" + id, {
method: "DELETE"
})

.then(response=> response.text())
.then(messaggio=> alert(messaggio))
.then(ricarica=> redirect())
.catch(errore => alert(errore))


}

/*-----------------------------------------------------------------------*/


function inputShown(){

let bottone = "<input type='text' id='input-filtro' class='mb-3 form-control' " +
"style='width:auto' placeholder='Inserisci filtro'>" +
"<div><button type='submit' onclick='filterFunction()' class='me-3 mb-5 btn btn-info'>Cerca</button>" +
"<button type='submit' onclick='redirect()' class='mb-5 btn btn-secondary'>Resetta Lista</button></div>"

document.getElementById('inputGhost').innerHTML=bottone;


}

function filterFunction(){


let sceltaCategoria = document.getElementById('filtering').value;
let filtro = document.getElementById('input-filtro').value;

let tabellaFilter = document.getElementById('bodyTabellaClienti');
tabellaFilter.HTML="";//ripulisco tabella

let URL="http://localhost:8080/api/clienteFilterBy/" + sceltaCategoria + "/" + filtro;


fetch(URL, {
method: "GET"
})
.then(response => response.json())

.then(cliente => {

let output="";
	
for (const cl of cliente) {
	let credito=0;
	if(cl.credito==null){
		credito=0;
	}else{
		credito=cl.credito;
	}
output +=   
'<tr>'+
'<td>'+ cl.id +'</td>'+
'<td>'+ cl.nome +'</td>'+
'<td>'+ cl.cognome +'</td>'+
'<td>'+ cl.telefono +'</td>'+
'<td>'+ cl.email +'</td>'+
'<td>'+ cl.indirizzo +'</td>'+
'<td>'+ cl.citta +'</td>'+
'<td>'+ cl.provincia +'</td>'+
'<td>'+ cl.regione +'</td>'+
'<td>'+ credito +'</td>'+
'</td>'+
'<td><button onclick="getClienteById('+ cl.id + ')" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#staticBackdrop">Modifica</button></td>'+
'<td><button onclick="deleteCliente('+ cl.id + ')" class="btn btn-danger">Cancella</button></td>'+
'</tr>';

}
			
tabellaFilter.innerHTML = output;

})

}




/*----------------------*/

function redirect() {

window.location.href="http://localhost:8080/lista-clienti"

}


