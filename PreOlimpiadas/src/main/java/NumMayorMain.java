class NumMayor{
    private int[] numeros;
    private int mayor = 0;

    public void setNum(int[] num){
        this.numeros = num;
    }

    public void Num(){
        int longitud = numeros.length;
        for(int i=0; i < longitud; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
    }

    public int getMayor(){
        return mayor;
    }
}

public class NumMayorMain {
    public static void main(String[] args) {
        int[] numeros = {5, 17, 2, 30, 14};

        NumMayor nm = new NumMayor();
        nm.setNum(numeros);
        nm.Num();

        System.out.println("El mayor es: " + nm.getMayor());
    }
}