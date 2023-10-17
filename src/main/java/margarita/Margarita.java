/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package margarita;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Margarita {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String jugar = "";
        do {
            System.out.println("Quieres repetir?");
            jugar = teclado.nextLine();
        } while (jugar.equalsIgnoreCase("Si"));
    }

    private static int preguntaMargaritas() {
        int numMargaritas = 0;
        try {
            do {
                System.out.println("¿Cuántas margaritas tienes (entre 1 y 10)?");
                numMargaritas = teclado.nextInt();
            } while (!(numMargaritas >= 1 && numMargaritas <= 10));
        } catch (InputMismatchException ime) {
            System.out.println("Error!!!");
        }
        System.out.println("Número margaritas " + numMargaritas);
        return numMargaritas;
    }

    private static int tiradaDado() {
        Random ran = new Random();
        int num;
        do {
            num = ran.nextInt(1, 6);
            if (num % 2 == 0) {
                System.out.println("La tirada fue " + num + " me quiere ");
            } else {
                System.out.println("La tirada fue " + num + "no me quiere");
            }
        } while (num == 3);
        return num;
    }
    
    private static int numeroHojas(){
        int contador = 1;
        System.out.println("Cuaántas hojas tiene la margarita Nº?" + contador);
        int numeroHojas = teclado.nextInt();
        
    }
}
