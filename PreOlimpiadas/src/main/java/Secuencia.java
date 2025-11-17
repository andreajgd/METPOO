class Secuencia{
    private int[] numeros;
    private int siguiente;

    public Secuencia(int[] numeros){
        this. numeros = numeros;
    }

    public void numSec(){
        siguiente = (numeros[numeros.length -1])+3;
        System.out.println("El siguiente número es: " + siguiente);
    }

    public int getsiguiene(){
        return siguiente;
    }


}
class Main {
    public static void main(String[] args) {
        int[] numeros = {1,4,7,10};
        Secuencia sc = new Secuencia(numeros);
        sc.numSec();
    }
}