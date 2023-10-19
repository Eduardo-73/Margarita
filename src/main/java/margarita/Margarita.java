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
        int numMargaritas, contador = 1, numrandom, numHojas;
        do {
            numMargaritas = preguntaMargaritas();
            for (int i = 0; i < numMargaritas; i++) {
                numHojas = numeroHojas(contador);
                numrandom = tiradaDado();
                if (numHojas % 2 == 0) {
                    if (!meQuiere(numrandom)) {
                        System.out.println("El resultado final es me quiere");
                    } else {
                        System.out.println("El resultado final es no me quiere");
                    }
                } else {
                    if (!meQuiere(numrandom)) {
                        System.out.println("El resultado final es no me quiere");
                    } else {
                        System.out.println("El resultado final es me quiere");
                    }
                }
                contador++;
            }
            teclado.nextLine();
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
            if (num == 3) {
                System.out.println("A salido 3, número de la mala suerte");
                System.out.println("Vuelves a tirar");
            }
        } while (num == 3);
        return num;
    }

    private static int numeroHojas(int contador) {
        System.out.println("Cuántas hojas tiene la margarita Nº" + contador + "?");
        int numeroHojas = teclado.nextInt();
        return numeroHojas;
    }

    private static boolean meQuiere(int num) {
        if (num % 2 == 0) {
            System.out.println("La tirada fue " + num
                    + " y empieza con me quiere ");
        } else {
            System.out.println("La tirada fue " + num
                    + " y empieza con no me quiere");
        }
        return true;
    }
}
