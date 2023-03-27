/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej12;

/**
 *
 * @author fabricio
 */
import java.util.Scanner;
public class TP1_EJ12 {
    
 public static void faltante(int array[], int indice) {
      int i,x=1;
      for(i=0;i<array[indice-1];i++){
        if(array[i]!=x){
          System.out.println(x);
          i-=1;
        }
        x++;
      }
  }
 
     public static void ordenar(int array[], int indice) {
      int i,aux;
     for(i=0;i<indice-1;i++){
       for(int j=i+1;j<indice;j++){
         if(array[i]>array[j]){
           aux=array[i];
           array[i]=array[j];
           array[j]=aux;
         }
       }
     }
        for(i=0;i<indice;i++){
       System.out.println(array[i]);
     }
  }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int op=1;
        int indice=teclado.nextInt();
        int array[]=int[indice];
             for(int i=0;i<indice;i++){
                   array[i]=teclado.nextInt();
                 }
        
        while(op!=0){
            System.out.println("-------MENU----------");
         System.out.println("1_FALTANTE");
           System.out.println("2_ORDENAR ARRAY");
           System.out.println("3_");
          System.out.println("4_");
           System.out.println("5_");
           System.out.println("6_");
            System.out.println("7_");
           System.out.println("8_");
           System.out.println("9_");
            System.out.println("10_");
           System.out.println("0_SALIR");
           System.out.println("INGRESE UNA OPCION"); 
           op=teclado.nextInt();
           switch(op){
               case 1: faltante(array,indice);
                   break;
               case 2: ordenar(array,indice);
                   break;
           }
        }
       
           
         
    }
    
}
