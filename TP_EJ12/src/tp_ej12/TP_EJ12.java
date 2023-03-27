/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_ej12;
import java.util.Scanner;
/**
 *
 * @author jd
 * 
 */
public class TP_EJ12 {
    
    public static int module1_ejercicio2(){
    Scanner teclado = new Scanner (System.in);
      System.out.println("Ingrese numero entero: ");
      int num = teclado.nextInt();
      int acu = 0, d;
      
      while(num != 0){
        d = num % 10;
        num = num / 10;
        acu += d;
      }
      
      return acu;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println("Aprendiendo a utilizar GIT");
        //System.out.println("otra linea de codigo");
        
        System.out.println("Menu");
        System.out.println("Modulo 1");
        System.out.println("Ejercicio 2");
        System.out.println("El resultado de los digitos es: " + module1_ejercicio2());
        
        System.out.println();
        
        
    }
    
}
