class ElevarCubo{
    private int numero;
    private int[] secuencia;

    public void setNum(int num){
        this.numero = num;
    }

    public void Num(){
        secuencia = new int[numero];

        for(int i = 1; i <= numero; i++){
            secuencia[i - 1] = i * i * i;
        }
    }

    public int[] getSecuencia(){
        return secuencia;
    }
}

class SecuenciaCubosMain {
    public static void main(String[] args) {

        ElevarCubo ec = new ElevarCubo();
        ec.setNum(6);
        ec.Num();

        int[] resultado = ec.getSecuencia();

        System.out.print("Secuencia de cubos: ");
        for(int n : resultado){
            System.out.print(n + " ");
        }
    }
}
