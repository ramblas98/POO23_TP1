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
    
    public static void module1_ejercicio2(){
    Scanner teclado = new Scanner (System.in);
      System.out.println("Ingrese numero entero: ");
      int num = teclado.nextInt();
      int acu = 0, d;
      
      while(num != 0){
        d = num % 10;
        num = num / 10;
        acu += d;
      }
      
      System.out.println("El resultado de los digitos es: " + acu);
      
}
    
    public static void module1_ejercicio4(){
        System.out.println("Modulo1-Ejercicio4");
        System.out.println("Este modulo cuenta pares e impares de una lista dada");
            // Crea un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);
    
        // Inicializa las variables sp y si en 0
        int sp = 0, si = 0;

        // Declarar un arreglo de enteros v
        int v[];

        // Lee el número de elementos de la lista ingresado por el usuario y lo asigna a la variable n
        System.out.print("Ingrese longitud: ");
        int n = teclado.nextInt();

        // Inicializa el arreglo v con el número de elementos ingresado por el usuario
        v = new int[n];

        // Lee cada número ingresado por el usuario y lo agrega al arreglo v
        for (int i = 0; i < n; i += 1){
          System.out.print("Ingrese elemento valor " + "["+i+"]: ");
          v[i] = teclado.nextInt();
        }

        // Suma los números pares e impares en las variables sp y si, respectivamente
        for (int i = 0; i < n; i += 1) {
          if (v[i] % 2 == 0) {
            sp += v[i];
          } else {
            si += v[i];
          } 
        } 

        // Muestra la suma de los números impares y luego la suma de los números pares
        
        System.out.println("Suma impares: " + si);
        System.out.println("Suma pares: " + sp);
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
        //desafio1-ejercicio2
        module1_ejercicio2();
        
        //desafio1-ejercicio4
        module1_ejercicio4();
        
        
    }
    
}
