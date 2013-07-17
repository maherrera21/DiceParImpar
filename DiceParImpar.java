/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diceparimpar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MIGUELH
 */
public class DiceParImpar {

    public static void main(String args[]) {
        // Declaraciones
        // Definicion de objetos para entrada de datos por el teclado
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader flujoEntrada = new BufferedReader(entrada);

        // Variable para tomar los datos leidos del flujo de entrada
        String datoEntrada;

        // Variables
        int num = 0;

        System.out.println("\n           DICE SI ES PAR O IMPAR\n");

        // Leer dato
        try {
            System.out.println("------------ Entrada del dato ------------");
            System.out.print("Teclee un numero entero (0-20): ");
            datoEntrada = flujoEntrada.readLine();
            num = Integer.parseInt(datoEntrada);
        } catch (IOException error) {
            System.err.println("Error " + error.getMessage());
        }

        // Imprimir salida
        switch (num) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
            case 18:
            case 20:

                System.out.println("\nEl numero " + num + " es " + "Par");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 15:
            case 17:
            case 19:
                System.out.println("\nEl numero " + num + " es " + "Impar");
                break;
            default:
                System.out.println("\nNo esta en el rango de 0 a 20");
        }
         
    }
}
