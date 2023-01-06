package problemas;

/*
 * @author cbhas & ALISrj
 */

public class Problema5 {
    
    public static void main(String[] args) {

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        System.out.println("La suma es: " + obtenerSuma(informacion));

    }

    public static int obtenerSuma(int[][] a) {

        int suma = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma = suma + a[i][j];

            }

        }
        return suma;
    }
}

