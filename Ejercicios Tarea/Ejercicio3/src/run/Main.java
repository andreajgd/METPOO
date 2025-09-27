package run;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro libro = new Libro();

        System.out.println("Titulo del libro:");
        libro.titulo = scanner.nextLine();
        System.out.println("Autor del libro:");
        libro.autor = scanner.nextLine();
        System.out.println("Cantidad de páginas:");
        libro.numpag = scanner.nextInt();

        System.out.println(libro.MostrarInfo());
        scanner.close();

    }



}
