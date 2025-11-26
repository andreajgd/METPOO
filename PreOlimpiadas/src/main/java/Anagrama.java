/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
 import java.util.Arrays;
 
class Main {
    public static Boolean Anagrama(String a, String b){
        char[] a1 = a.toCharArray(); 
        char[] b1 = b.toCharArray(); 
        
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1, b1);
        
    }
    public static void main(String[] args) {
        System.out.println(Anagrama("pedro", "poder"));
    }
}
