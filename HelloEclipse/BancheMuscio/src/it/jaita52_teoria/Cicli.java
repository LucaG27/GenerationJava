package it.jaita52_teoria;

public class Cicli {

	public static void main(String[] args) { //INIZIO 

		int a =123;
		float b = 1.23f;
		double c = 32233.3223;
		char d = 'c';
		String s = "Ciao 123";

		float baseTriangolo = 5.5f;
		float altezzaTriangolo = 8f;
		float areaTriangolo = 0f;

		areaTriangolo = baseTriangolo * altezzaTriangolo / 2;

		System.out.println("Questo è il risultato: " + areaTriangolo);

		if(areaTriangolo == baseTriangolo) {
			//VERO
			System.out.println("Condizione Verificata");
		} else {
			//FALSO
			System.out.println("Condizione non verificata");

			if (areaTriangolo == 20f) {
				System.out.println("L'area è 20");
			} else if(areaTriangolo == 22f) {
				System.out.println("L'area è 22");
			} else {
				System.out.println("Non so quanto vale");
			}

			int p = 9;

			switch(p) {
			case 1: //SE s == 1 esegui questo blocco di codice
				System.out.println("Ciao questo caso funziona1");
				break; 
			case 2: //SE s == 2 esegui questo blocco di codice
				System.out.println("Ciao questo caso funziona 2");
				break;
			case 3: //SE s == 3 esegui questo blocco di codice
				System.out.println("Ciao questo caso funziona 3");
				break;
			case 4: //SE s == 4 esegui questo blocco di codice
				System.out.println("Ciao questo caso funziona 4");
				break;
			case 5: //SE s == 5 esegui questo blocco di codice
				System.out.println("Ciao questo caso funziona 5");
				break;
			default: //SE NESSUN CASO E' RISPETTATO
				System.out.println("Ciao nessuno dei precedenti funziona");

				int x = 81,y = 0; //WHILE
				while( (y*y) != x ) { //finchè la condizione è vera
					y++; //incrementa di 1
					//y = y + 1;
					//y += 1;

				}
				System.out.println("La radice quadrata di: "+ x + " è: "+ y);

				int w = 16, z = 0; //DO WHILE
				do {  //prima faccio una determinata lista di azioni e poi verifico

					z++;
				} while((z*z) != w);
				System.out.println("La radice quadrata di: "+ w + " è: "+ z);

				//inizializzazione; condizione; incremento/decremento
				for(int i = 0; i < 6; i++) { //FOR
					System.out.println("Ciao, mi chiamo i:" +i);
				}

				for(int i = 0; i < 2; i++) { //CICLO ANNIDATO FOR
					for(int j = 0; j < 13; j++) { 
						System.out.print("*");
					}
					System.out.println("*");


				}
			}
		}
	}
} //FINE

