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
        
        do {            
             margEvaluar();
             
        } while (false);
       
    }

    private static int dado() {
        Random random = new Random();
        return random.nextInt(1,7);
    }
    
    private static int margEvaluar(){
        int num = 0;
        do{
        try {
        System.out.println("Elige el número de margariatas (1-10)");
        num = teclado.nextInt();
        System.out.println("Número de margarita " + num);
        } catch () {
            System.out.println("Tienes que elegir un número que se "
                    + "encuentre entre los parametros ");
        }
        }while(num > 0 && num < 11);
        return num;
    }
    
//    private static boolean meQuiereNoMeQuiere (){
//        System.out.println("Dame un número de hojas: ");
//        int numhojas = teclado.nextInt();
//        
//        if ()
//    }

    private static int contarMargaritas() {

        int numMarg = 0;
        System.out.println("Quieres iniciar el programa 'Si/No' ");
        String iniciar = teclado.nextLine();

        if (iniciar.equalsIgnoreCase("si")) {
            System.out.println("¿Cuántas margaritas quieres deshojar:? ");
            numMarg = teclado.nextInt();
        } else {
            System.out.println("Tu te lo pierdes!! ");
        }
        return numMarg;
    }
}
