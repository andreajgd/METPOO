package run;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cantidad1, cantidad2;

        CuentaBancaria CB = new CuentaBancaria();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        CB.titular = sc.nextLine();

        System.out.println("Ingrese su saldo: ");
        CB.saldo = sc.nextDouble();

        sc.nextLine();

        while (true) {
            System.out.println("Desea Agregar o Retirar Dinero? (s/n)");
            String op = sc.nextLine();
            if (op.equals("s")) {
                System.out.println("1. Agregar. \n 2. Retirar.");
                int op2 = sc.nextInt();
                sc.nextLine();
                if (op2 == 1) {
                    System.out.println("Cantidad: ");
                    cantidad1 = sc.nextDouble();
                    System.out.println("Monto total: " + CB.AgregarDinero(cantidad1));
                    break;
                }
                if (op2 == 2) {
                    System.out.println("Cantidad: ");
                    cantidad2 = sc.nextDouble();
                    System.out.println("Monto total: " + CB.RetirarSaldo(cantidad2));
                    break;
                } else {
                    System.out.println("Opción Invalida");
                }
            }
            if (op.equals("n")) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opcion Invalida. Intente de nuevo.");
            }
            sc.close();
        }
    }
}
