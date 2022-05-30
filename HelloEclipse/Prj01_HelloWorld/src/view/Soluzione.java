package view;

public class Soluzione {

	public static void main(String[] args) {
        System.out.println("Esercizio 01 - Rotazione in avanti di un array int[]");
//        prova(new int[] { 4, 9 });
//        prova(new int[] { 4, 9, 3 });
        prova(new int[] { 4, 9, 3, 7 });
    }

    private static void prova(int[] array) {
        String strArray = EserciziUtil.toString(array);
        ruotaAvanti(array);
        String strArrayRis = EserciziUtil.toString(array);

        System.out.println(strArray + "  --->  " + strArrayRis);
    }

    public static void ruotaAvanti(int[] array) {
        if (array.length > 1) {
            int ultimo = array[array.length - 1];

            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i-1];
            }

            array[0] = ultimo;
        }
    }
}
