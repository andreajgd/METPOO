import java.util.ArrayList;
import java.util.List;

class SecuenciaLista {
    private List<Integer> numeros;
    private int siguiente;

    public SecuenciaLista(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void calcularSiguiente() {
        int ultimo = numeros.get(numeros.size() - 1);
        int penultimo = numeros.get(numeros.size() - 2);

        int ultimaDiferencia = ultimo - penultimo;
        int siguienteDiferencia = ultimaDiferencia + 1;

        siguiente = ultimo + siguienteDiferencia;

        System.out.println("El siguiente número es: " + siguiente);
    }

    public int getSiguiente() {
        return siguiente;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> datos = new ArrayList<>();
        datos.add(5);
        datos.add(8);
        datos.add(12);
        datos.add(17);
        datos.add(23);

        SecuenciaLista sec = new SecuenciaLista(datos);
        sec.calcularSiguiente();
    }
}