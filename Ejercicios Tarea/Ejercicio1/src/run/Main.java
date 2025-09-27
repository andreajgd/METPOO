package run;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona person = new Persona();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre:  ");
        person.nombre = sc.nextLine();
        System.out.println("Edad:  ");
        person.edad = sc.nextInt();


        System.out.printf(person.MostrarDatos());
        sc.close();
    }
}
