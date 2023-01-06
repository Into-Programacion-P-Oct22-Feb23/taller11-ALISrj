package problemas;

import java.util.Scanner;
import java.util.Locale;

/*
 * @author cbhas & ALISrj
 */

public class Problema2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion;

        System.out.print("Ingrese 1, si desea sacar el area del cuadrado."
                + "\n" + "Ingrese 2, si desea sacar el area del triángulo." + "\n"
                + "Ingrese 3, si desea sacar el area del rectángulo." + "\n");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();

        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();

            } else {
                if (opcion == 3) {
                    obtenerAreaRecatangulo();

                } else {
                    System.out.println("Valor fuera de rango.");
                }
            }
        }

    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double lado;
        double operacion;

        System.out.println("\nIngrese el valor de lado:");
        lado = entrada.nextDouble();

        operacion = Math.pow(lado, 2);
        System.out.println("\nEl area del cuadrado es: " + operacion);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double operacion;

        System.out.println("\nIngrese el valor de la base:");
        base = entrada.nextDouble();

        System.out.println("Ingrese el valor de la altura:");
        altura = entrada.nextDouble();

        operacion = (base * altura) / 2;
        System.out.println("\nEl area del triángulo es: " + operacion);

    }

    public static void obtenerAreaRecatangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double operacion;

        System.out.println("\nIngrese el valor de la base:");
        base = entrada.nextDouble();

        System.out.println("Ingrese el valor de la altura:");
        altura = entrada.nextDouble();

        operacion = base * altura;
        System.out.println("\nEl area del rectángulo es: " + operacion);

    }

}
