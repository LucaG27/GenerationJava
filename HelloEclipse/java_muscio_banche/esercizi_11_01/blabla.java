package esercizi_11_01;

public class blabla {

	public static void main(String[] args) {
		
		
		
		
		int incremento = 2;
        StringBuilder stringa_Prova3 = new StringBuilder("654321");
        String stringa_Prova4 = "1";



            for(int m = 6; m > 0; m--) {
            System.out.println(stringa_Prova4 + "  " + "  " +  stringa_Prova3);
            stringa_Prova3.deleteCharAt(0);
            stringa_Prova4 = stringa_Prova4 + incremento;
            incremento ++;
            }

            

	}

}
