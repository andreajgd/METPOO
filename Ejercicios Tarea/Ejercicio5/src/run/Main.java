package run;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estudiante est = new Estudiante();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre del estudiante:");
        est.nombre = scanner.nextLine();
        System.out.println("Matricula del estudiante:");
        est.matricula = scanner.nextLine();
        System.out.println("Nota:");
        est.promedio = scanner.nextDouble();

        System.out.println(est.Promedio());
    }
}
