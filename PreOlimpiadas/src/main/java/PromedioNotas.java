import java.util.ArrayList;
class PromedioNotas {

    public static double promedio(){
        int promedio;
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(70);
        notas.add(85);
        notas.add(90);
        notas.add(60);
        notas.add(75);
        notas.add(95);
        int suma = 0;

        for(int i: notas){
            suma += i;
        }

        promedio = suma / notas.size();
        return promedio;
    }

    public static ArrayList<Integer> notasMayores(){

        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(70);
        notas.add(85);
        notas.add(90);
        notas.add(60);
        notas.add(75);
        notas.add(95);

        ArrayList<Integer> notasB = new ArrayList<>();

        double promedio = promedio();

        for (int i : notas){
            if(i < promedio)
            {
                notasB.add(i);
            }
        }

        return notasB;
    }

    public static void main(String[] args) {
        System.out.println(promedio());
        System.out.println(notasMayores());

        System.out.println();
    }
}