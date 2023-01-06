package problemas;

import java.util.Scanner;
import java.util.Locale;

/*
 * @author cbhas & ALISrj
 */

public class Problema4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;
        int opcion;
        String nombre;
        String cedula;

        while (bandera) {
            System.out.println("Ingrese tu nombre:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la cedula:");
            cedula = entrada.nextLine();
            System.out.println("Ingrese 1, para calcular la planilla de luz."
                    + "\nIngresa 2, para calcular el predio.");
            opcion = entrada.nextInt();

            if (opcion == 1 || opcion == 2) {
                if (opcion == 1) {
                    calcularValorLuz(nombre, cedula);
                } else {
                    cacularPredio(nombre, cedula);
                }
                System.out.println("Si desea salir ingrese 3");
                opcion = entrada.nextInt();
                entrada.nextLine();
                if (opcion == 3) {
                    bandera = false;
                }
            } else {
                System.out.println("Valor fuera de rango");
                bandera = false;
            }
        }
    }

    public static void calcularValorLuz(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double precioKv;
        double kvMes;
        double operacion;

        System.out.println("Ingrese el precio del Kilovatio:");
        precioKv = entrada.nextDouble();
        System.out.println("Ingrese los Kvs consumidos en el mes:");
        kvMes = entrada.nextDouble();

        operacion = precioKv * kvMes;

        System.out.printf("\nCliente %s con cedula %s "
                + "debe cancelar el valor de $%.2f\n",
                nombre,
                cedula,
                operacion);

    }

    public static void cacularPredio(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double valor;
        double predio;
        System.out.println("Ingrese el valor del inmueble:");
        valor = entrada.nextDouble();
        predio = (valor * 2) / 100;

        System.out.printf("\nCliente %s con cedula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar un predio de $%.2f\n",
                nombre,
                cedula,
                valor,
                predio);

    }
}
