/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_ej12;
import java.util.Scanner;

/**
 *
 * @author Zenteno
 */
public class TP1_EJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Ejercicio 2");
       Scanner teclado= new Scanner (System.in);
      
       int num = teclado.nextInt();
       int acu =0, d ;
       
       while (num != 0){
         d = num % 10;
         num = num / 10;
         acu = acu + d;
       }
       
       System.out.println( acu );
    }
    
}
