package problemas;

/*
 * @author cbhas & ALISrj
 */

public class Problema1 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }

    public static void imprimirDatos(int[][] datos) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if (datos[i][j]%2 == 0){
                    System.out.println(datos[i][j]);
                }
                
            }
        }
    
    }

}
