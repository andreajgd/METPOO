/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
 
class Fibonacci{
    int num1 =0;
    int num2 = 1;
    int siguiente = 0;
    
    public void Fib(){
        for(int i = 0; i <=50; i++){
            siguiente = num1+num2;
            System.out.println(siguiente);
            num1 = num2;
            num2= siguiente;
        }
    }
}
class Main {
    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();
        fb.Fib();
    }
}
