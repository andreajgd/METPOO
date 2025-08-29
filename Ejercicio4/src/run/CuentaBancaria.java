package run;

public class CuentaBancaria {

    String titular;
    double saldo;

    /*public Ejercicio5.CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }*/

    public double RetirarSaldo(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return saldo;
        } else {
            System.out.println("Retiro fallido: fondos insuficientes o cantidad no válida.");
            return -1;
        }

    }

    public double AgregarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return saldo;
        } else {
            System.out.println("Retiro fallido: fondos insuficientes o cantidad no válida.");
            return -1;
        }

    }
}