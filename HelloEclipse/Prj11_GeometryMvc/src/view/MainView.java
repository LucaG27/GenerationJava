package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.InputObject;

import controller.GeomController;

public class MainView {

	/* 
	 * Scrivi un programma che date in input diverse forme geometriche
	 * Ne calcoli il perimetro
	 */
	public static void main(String[] args) {
		
		
		//Prendere gli input
		List<InputObject> input;
		try {
			input = leggiInput();
			//Instaziare il controller
			GeomController g=new GeomController();
			
			//Usarlo per verificare i dati
			g.setInput(input);
			
			//Usarlo per fare la logica
			g.calcola();
			
			//Mostrare gli output
			List<String> out=g.getOutput();
			for(String str:out) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static List<InputObject> leggiInput() throws Exception{
		List<InputObject> oggettiLetti= new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		
		String tipoForma;
		do {
			
			System.out.println("Inserire il tipo forma, oppure vuoto per proseguire.");
			tipoForma=sc.nextLine();
	
			InputObject forma=new InputObject();
			forma.setFormaGeometrica(tipoForma);
			
			switch(tipoForma.toUpperCase()) {
			case "RETTANGOLO":
				
				System.out.println("Inserire base");
				forma.setBase(nextInt(sc));
				
				System.out.println("Inserire altezza");
				forma.setAltezza(nextInt(sc));
				
				break;
				
			case "TRIANGOLO":
				System.out.println("Inserire base");
				forma.setBase(nextInt(sc));
				
				System.out.println("Inserire lato1");
				forma.setLato1(nextInt(sc));
				
				System.out.println("Inserire lato2");
				forma.setLato2(nextInt(sc));
			    break;
			    
			default: 
				throw new Exception();
				
			}
			
			oggettiLetti.add(forma);
			
		}while(!tipoForma.isEmpty());
		
		return oggettiLetti;
		
	}
	
	private static int nextInt(Scanner sc){
		int res=-1;
		try {
			res=Integer.parseInt(sc.nextLine());
			return res;
		}catch(NumberFormatException nfe) {
			System.out.println("Non è stato inserito un numero, riprovare");
			return nextInt(sc); //chiamata ricorsiva in caso di errore
		}
	}
	
	

}