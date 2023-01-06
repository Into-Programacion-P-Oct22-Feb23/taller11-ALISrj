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
    }

    public static String[] funcionArreglo() {
        Scanner entrada = new Scanner(System.in);
        
        int tamano;
        
        System.out.println("Ingrese el tamaño del arreglo:");
        tamano = entrada.nextInt();
        String[] ciudades = new String[tamano];
        
        for (int i = 1; i <= tamano; i++) {
            System.out.printf("Ingrese la ciudad número %d",i);
            ciudades[i] = entrada.nextLine();
        }
    }
}
