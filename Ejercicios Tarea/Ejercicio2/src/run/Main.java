package run;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //objeto scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        Coche car = new Coche();

        System.out.println("Ingresa la marca del coche:");
        car.marca = scanner.nextLine();

        System.out.println("Ingresa el modelo del coche:");
        car.modelo = scanner.nextLine();

        System.out.println("Ingresa el año del coche:");
        car.year = scanner.nextInt();

        System.out.println(car.MostrarInfo());


        scanner.close();
    }
}
