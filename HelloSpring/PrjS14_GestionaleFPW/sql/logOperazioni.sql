create table login (
id int auto_increment primary key,
email varchar(50) not null unique,
password varchar(50) not null,
ruolo enum('cliente', 'supervisore', 'impiegato'),
nome varchar(50) not null,
cognome varchar(50) not null
);

alter table login add cliente_id int references cliente(id);
alter table login add impiegato_id int references impiegato(id);

clienti 
|  1 | rossi    | paolo   | 0116702323 | paolo25@gmail.com     | Via Roma 25          | torino  | To        | Piemonte       |     107 |
|  2 | mori     | marco   | 0116704040 | marco18@gmail.com     | Via Torino 18        | milano  | Mi        | Lombardia      |    NULL |
|  3 | bianchi  | luca    | 0116701010 | luca2@gmail.com       | Via Milano 2         | bologna | Bo        | Emilia-Romagna |    2119 |
|  4 | verdi    | mario   | 0116702020 | mario128@gmail.com    | Corso Francia 128    | torino  | To        | Piemonte       |    NULL |
|  5 | rosso    | alberto | 0116707070 | alberto12@icloud.com  | Corso Svizzera 12    | milano  | Mi        | Lombardia      |     789 |
|  6 | esposito | franco  | 0119978812 | francoe@icloud.com    | Via Roma 3           | Asti    | At        | Piemonte       |    1875 |
|  7 | bruni    | carlo   | 0117778816 | brunicarlo@icloud.com | Corso Stati Uniti 13 | Torino  | To        | Piemonte       |    NULL

INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...);


insert into login (email, password, ruolo, nome, cognome, cliente_id)
values ("paolo25@gmail.com", "paolo123", "cliente", "Paolo", "Rossi", 1),
("marco18@gmail.com", "marco123", "cliente", "Marco", "Mori", 2),
("luca2@gmail.com", "luca123", "cliente", "Luca", "Bianchi", 3),
("mario128@gmail.com", "mario123", "cliente", "Mario", "Verdi", 4),
("alberto12@icloud.com", "alberto123", "cliente", "Alberto", "Rosso", 5),
("francoe@icloud.com", "franco123", "cliente", "Franco", "Esposito", 6),
("brunicarlo@icloud.com", "bruni123", "cliente", "Bruni", "Carlo", 7);


impiegato
|  1 | Mario  | Rossi   | tecnico        |   NULL |   2500.00 |          1 |
|  2 | Marco  | Bianchi | amministrativo |      7 |   1600.00 |          2 |
|  3 | Paolo  | Verdi   | amministrativo |      7 |   1600.00 |          2 |
|  4 | Enrico | Marrone | venditore      |      8 |   1300.00 |          3 |
|  5 | Nicola | Testa   | venditore      |      8 |   1300.00 |          3 |
|  6 | Franco | Barba   | tecnico        |      1 |   1500.00 |          1 |
|  7 | Elena  | Totti   | amministrativo |   NULL |   2600.00 |          2 |
|  8 | Paola  | Capra   | venditore      |   NULL |   2300.00 |          3 |
|  9 | Mauro  | Barba   | venditore      |      8 |   1300.00 |          3 |
tecnico=impiegato
amministrativo=supervisore
venditore=impiegato
;

insert into login (email, password, ruolo, nome, cognome, impiegato_id)
values ("mariorossi@gmail.com", "mario123", "impiegato", "Mario", "Rossi", 1),
("marcobianchi@gmail", "marco123", "supervisore", "Marco", "Bianchi", 2),
("paoloverdi@gmail", "paolo123", "supervisore", "Paolo", "Verdi", 3),
("enricomarrone@gmail", "enrico123", "impiegato", "Enrico", "Marroni", 4),
("nicolatesla@gmail", "tesla123", "impiegato", "Nicola", "Tesla", 5),
("francobarba@gmail", "barba123", "impiegato", "Franco", "Barba", 6),
("elenatotti@gmail", "forzaroma", "supervisore", "Elena", "Totti", 7),
("paolacapra@gmail", "sopralapanca", "impiegato", "Paola", "Capra", 8),
("maurobarba@gmail", "barbone42", "impiegato", "Mauro", "Barba", 9);


alter table articolo modify rimanenza tinyint unsigned;