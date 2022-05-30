Esercitazione Finale del corso Java

Implementare un software gestionale avente le seguenti funzionalità:
Pagina di login con informazioni di accesso prese da TABELLA_NUOVA, ogni utente avrà come minimo Nome, Cognome, Mail, Password e Ruolo
Ruolo può essere cliente, impiegato o supervisore.  

In base al tipo di utente che ha effettuato l'accesso gestire un menù unico per tutta l'applicazione che mostri solo le funzionalità effettivamente accessibili dal tipo di utente loggato.  

Accertarsi che un utente di un determinato tipo non riesca ad operare funzionalità non autorizzate (esempio manomettendo la URL del browser).  

Nota: Inserire BE / FE con ? stilato e non provato o X per stilato e funzionante.

Funzionalità dal supervisore
- [F_ART_1] Vedere la lista generare degli articoli e filtrarla per descrizione, prezzo (range da - a ) e categoria 			X
- [F_ART_2A] Inserire un nuovo articolo 																						X
- [F_ART_2B] Inserire massivamente nuovi articoli mendiante import CSV 															X
- [F_ART_3] Modificare un articolo esistente 																					X
- [F_CLI_1] Visualizzare la lista generale clienti e filtrarla per nome, cognome, telefono o email. 							X
- [F_CLI_2] Inserire un nuovo cliente (e creare un profilo utente accedibile) 													X - ?
- [F_CLI_3] Modificare un cliente esistente 																					X
- [F_IMP_1] Visualizzare la lista generale impiegati e filtrarla per nome, cognome, ruolo e stipendio range da-a				X
- [F_IMP_2] Inserire un nuovo impiegato (e creare un profilo utente accedibile) 												X - ?
- [F_IMP_3] Modificare un impiegato esistente
- [F_ORD_1A] Visualizzare la lista degli ordini comprensiva di importo totale e di riferimento di impiegato e cliente. 			X
- [F_ORD_1B] Esportare in file CSV la lista degli ordini comprensiva di importo totale e di riferimento di impiegato e cliente. X

Funzionalità del cliente
- [F_ART_1] Vedere la lista generare degli articoli e filtrarla per descrizione, prezzo (range da - a ) e categoria 			X
- [F_ORD_2] Visualizzare la lista dei PROPRI ordini comprensiva di dettaglio dei prodotti ordinati 								X
- [F_CLI_4] Visualizzare e modificare la PROPRIA scheda cliente comprensiva di dati di accesso. ? - Si necessita del trigger	

Funzionalità dell'impiegato
- [F_ART_1] Vedere la lista generare degli articoli e filtrarla per descrizione, prezzo (range da - a ) e categoria 			X
- [F_CLI_1] Visualizzare la lista generale clienti e filtrarla per nome, cognome, telefono o email. 							X
- [F_CLI_2] Inserire un nuovo cliente (e creare un profilo utente accedibile) 													X - ?
- [F_CLI_3] Modificare un cliente esistente 																					X
- [F_ORD_3] Visualizzare la lista di PROPRI ordini comprensiva di importo totale, lista prodotti e di riferimento a cliente.	X
- [F_ORD_4] Inserimento di un nuovo ordine scegliendo i prodotti e le quantità nonchè il cliente