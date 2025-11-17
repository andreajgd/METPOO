class NumPar{
    private int numero;
    private int suma;

    public void setNum(int num){
        this.numero = num;
    }

    public void Num(){
        for(int i=numero; i <= 50; i++){
            if(i % 2 != 0){
                suma += i;
            }
        }
    }

    public int getSum(){
        return suma;
    }
}

class Main {
    public static void main(String[] args) {
        NumPar np = new NumPar();
        np.setNum(1);
        np.Num();
        System.out.println("La suma es: " + np.getSum());
    }
}