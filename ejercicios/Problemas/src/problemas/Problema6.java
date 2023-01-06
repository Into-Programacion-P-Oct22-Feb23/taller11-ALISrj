package problemas;

/*
 * @author cbhas & ALISrj
 */

public class Problema6 {
    public static void main(String[] args) {

        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        System.out.printf("La media aritmética es: %.0f\n",
                mediaAritmetica(informacion));
        System.out.printf("La desviación estándar es: %.2f\n",
                desviacionEstandar(informacion));

    }

    public static double mediaAritmetica(int[] a) {

        double suma = 0;
        double media = 0;

        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        media = suma / a.length;

        return media;
    }

    public static double desviacionEstandar(int[] a) {

        double suma = 0;
        double media = mediaAritmetica(a);
        double numerador = 0;
        double desviacion;

        for (int i = 0; i < a.length; i++) {

            numerador = numerador + Math.pow(a[i] - media, 2);

        }
        desviacion = Math.sqrt(numerador / a.length);
        return desviacion;
    }
}

