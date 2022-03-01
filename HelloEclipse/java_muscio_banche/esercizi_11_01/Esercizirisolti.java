package esercizi_11_01;

public class Esercizirisolti {

	public static void main(String[] args) {
		
        //## 1.1. Esercizio
        //Scrivere un programma che stampi a video i primi dieci numeri interi
		System.out.println("Esercizio 1");
		for (int i = 1; i < 11; i++) {
			  System.out.println(i);
		}

		
		System.out.println("");
		System.out.println("Esercizio 2");
		//## 1.2. Esercizio
		//Scrivere un programma che stampi a video i primi dieci interi pari 
		//compresi fra 20 e 0, partendo da 20.

		for (int i = 20; i > 0; i = i - 2) {
			System.out.println(i);
		}
		
		System.out.println("");
		System.out.println("Esercizio 3");
		//## 1.3. Esercizio
		//Scrivere un programma che stampi le tabellina del numero dato come 
		//argomento
		
		int x = 4;
		
		for(int i = 1; i <= 10; i++) {
			
            System.out.println(x * i);
		}
		
		
		System.out.println("");
		System.out.println("Esercizio 4");
		//## 1.4. Esercizio
		//Stampare a video la seguente figura:
		//******
		//*****
		//****
		//***
		//**
		//*
		
		for(int i = 6; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
		System.out.println("");
		System.out.println("Esercizio 5");
		
		//## 1.5. Esercizio
		//Stampare a video la seguente figura:
		//#
		//##
		//###
		//####
		//#####
		//######
		
		for( int i = 6; i > 0; i--) {
			for(int j = 6; j >= i; j--) {
				System.out.print("# ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("Esercizio 6");
		System.out.println("errore 404: esercizio non trovato");
		//## 1.6. Esercizio
		//Stampare a video la seguente figura:
		//1      654321
		//12      54321
		//123      4321
		//1234      321
		//12345      21
		//123456      1
		
//		for(int i = 0; i <= 6; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print( j );
//				System.out.print( "  " );				
//			}
//			for (int j = 6; j >= i; j--) {
//				System.out.print( j );
//			}
//			System.out.println("");
//		}

		
// 
		
		System.out.println("");
		System.out.println("Esercizio 7");
		//## 1.7. Esercizio
		//Scrivere un programma che stampi i primi 100 elementi della successione di 
		//Fibonacci.
		
		
		//ho cercato su internet che tipo di dato usare, long iniziava a usare i negativi verso la fine
	/*	 long a=0,b=1,c=101;
		 BigInteger n1 = BigInteger.valueOf(a);
		 BigInteger n2 = BigInteger.valueOf(b);
		 
		 System.out.print("0 1");
		    
		 for(int i = 2; i < c; i++) {    
			BigInteger n4 = n1.add(n2);
		  System.out.print(" "+n4);    
		  n1=n2;    
		  n2=n4;    
		   }    												*/
		  
		 
		
		
	}}



		