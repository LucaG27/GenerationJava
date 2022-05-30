package view;
/*
 * Esercizi sugli array (serie 1)
 * https://andbin.it/blog/java/esercizi-array-serie-1
 *
 * Andrea Binello ("andbin")
 */

public class EserciziUtil {
    private EserciziUtil() {}

    public static String toString(int[] array) {
        if (array == null) {
            return "null";
        } else {
            StringBuffer buf = new StringBuffer("{");

            for (int i = 0; i < array.length; i++) {
                buf.append(i == 0 ? " " : ", ").append(array[i]);
            }

            return buf.append(" }").toString();
        }
    }

    public static String toString(boolean[] array) {
        if (array == null) {
            return "null";
        } else {
            StringBuffer buf = new StringBuffer("{");

            for (int i = 0; i < array.length; i++) {
                buf.append(i == 0 ? " " : ", ").append(array[i]);
            }

            return buf.append(" }").toString();
        }
    }
}
