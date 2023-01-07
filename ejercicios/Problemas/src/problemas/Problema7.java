/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades;
        ciudades = funcionArreglo();
        procedimiento(ciudades);
    }

    public static String[] funcionArreglo() {
        Scanner entrada = new Scanner(System.in);
        
        int tamano;
        
        System.out.println("Ingrese el tamaño del arreglo:");
        tamano = entrada.nextInt();
        String[] ciudades = new String[tamano];
        entrada.nextLine();
        int contador = 1;
        
        for (int i = 0; i < tamano; i++) {
            System.out.printf("Ingrese la ciudad número %d:\n",contador);
            ciudades[i] = entrada.nextLine();
        }
        
        return ciudades;
    }
    public static void procedimiento(String[] ciudades){
        String mensaje = "";
        for (int i = 0; i < ciudades.length; i++) {
            if (ciudades[i].length() == 5 || ciudades[i].length() == 4  ) {
                mensaje = String.format("%s\n%s",mensaje,ciudades[i]);
            }
        }
        System.out.printf("Las ciudades de 4 a o 5 caracteres son:%s",mensaje);
    }
}
