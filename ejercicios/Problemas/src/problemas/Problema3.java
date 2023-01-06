package problemas;

import java.util.Scanner;
import java.util.Locale;

/*
 * @author cbhas & ALISrj
 */

public class Problema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valor1;
        double valor2;
        double valor3;
        double valor4;

        System.out.println("Ingrese la nota 1");
        valor1 = entrada.nextDouble();

        System.out.println("Ingrese la nota 2");
        valor2 = entrada.nextDouble();

        System.out.println("Ingrese la nota 3");
        valor3 = entrada.nextDouble();

        System.out.println("Ingrese la nota 4");
        valor4 = entrada.nextDouble();

        System.out.printf("El promedio de las notas: "
                + "%.2f, %.2f, %.2f, %.2f es %s",
                 valor1,
                 valor2,
                 valor3,
                 valor4,
                 promedioCualitativo(valor1, valor2, valor3, valor4));
    }

    public static String promedioCualitativo
    (double valor1, double valor2, double valor3, double valor4) {

        String mensaje;
        double promedio;
        promedio = (valor1 + valor2 + valor4 + valor4) / 4;

        if (promedio >= 0 && promedio <= 5) {
            mensaje = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                mensaje = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    mensaje = "Muy Bueno";
                } else {
                    mensaje = "Sobresaliente";

                }

            }

        }
        return mensaje;
    }

}
