/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package margarita;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Margarita {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

       
        meQuiereNoMeQuiere();

    }

    private static int dado() {
        Random random = new Random();
        int num = random.nextInt(1,7);
        while (num == 3){
            System.out.println("Ha salido el 3 el número de la mala suerte,"
                    + "vuelves a tirar");
            num = random.nextInt(1,7);
        }
        return num;
    }

    private static int margEvaluar() {
        int num = 0;
        do {
            try {
                System.out.println("Elige el número de margariatas (1-10):");
                num = teclado.nextInt();
                System.out.println("Número de margarita " + num);
            } catch (Exception e) {
                System.out.println("Tienes que elegir un número que se "
                        + "encuentre entre los parametros ");
            }
        } while (num > 0 && num < 11);
        return num;
    }

    private static boolean meQuiereNoMeQuiere() {
        int hoja = 0;
        hoja++;
        int dado = dado();
        System.out.println("¿Cuántas hojas tiene la margarita N" + hoja + "?");
        int numhojas = teclado.nextInt();
        if (dado % 2 == 0) {
            System.out.println("La tirada fue " + dado + " y empieza por "
                    + "'me quiere'");
        } else {
            System.out.println("La tirada fue " + dado + " y empieza por "
                    + "'no me quiere'");
        }
        return true;
                
    }

    private static int contarMargaritas() {

        int numMarg = 0;
        System.out.println("Quieres iniciar el programa 'Si/No' ");
        String iniciar = teclado.nextLine();

        if (iniciar.equalsIgnoreCase("si")) {
            margEvaluar();
        } else {
            System.out.println("Tu te lo pierdes!! ");
        }
        return numMarg;
    }
}
