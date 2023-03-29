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
public static void minimos(int array[], int indice) {
  
 
  int i,minimo1,minimo2;
 
  minimo1=array[0];
  minimo2=array[0];
  for(i=0;i<indice;i++){
    if (array[i] < minimo1) {
        minimo1= array[i];
    }
  }
   for(i=0;i<indice;i++){
    if (array[i] < minimo2 && array[i]!=minimo1) {
        minimo2 = array[i];
    }
  }
  System.out.println("minimo"+minimo1);
  System.out.println("segundo minimo"+minimo2);
  }
  public static void reversa(int array[], int indice) {

    for(int i=indice-1;i>-1;i--){
      System.out.println(array[i]);
    }
  }
   public static void ordenrev(int array[], int indice){       
    int i,aux=0;
    for(i=0;i<indice-1;i++){
       for(int j=1+i;j<indice;j++){
     if(array[i]<array[j]){
       aux=array[i];
       array[i]=array[j];
       array[j]=aux;
      }
     }
    }
     for(i=0;i<indice;i++){
      System.out.print(array[i]+"_");
    }
  
  }
   
    public static void ordenarsalteado(int array[], int indice) {
     int j,i,aux,x=0;
     for(i=0;i<indice-1;i++){
       for(j=i+1;j<indice;j++){
         if(array[i]>array[j]){
           aux=array[i];
           array[i]=array[j];
           array[j]=aux;
         }
       }
     }
     for(i=0;i<indice;i++){
       
       if(i%2!=0 || i==1){
         System.out.println(array[indice-x]);
         
       }
       else{
         System.out.println(array[x]);
         x+=1;
       }
     }
  }
    
      public static void multiplicar(int array[], int indice) {
     for(int i=0;i<indice;i++){
        System.out.println(array[i]*2);
     }
  }
     public static void buscar(int array[], int indice) {
         Scanner teclado=new Scanner(System.in);
      int i,bandera=0;
        System.out.println("ingrese un numero para buscar");
       int x=teclado.nextInt();
       
     for(i=0;i<indice;i++){
        if(array[i]==x){
          bandera=1;
        }
     }
     if(bandera==1){
       System.out.println("PRESENT");
     }
     else{
       System.out.println("NOT PRESENT");
     }
  }
     
      public static void mayor(int array[], int indice) {
      int i,mayor=0;
     for(i=0;i<indice;i++){
        if(array[i]>mayor){
          mayor=array[i];
        }
     }
       System.out.println("numero mayor"+mayor);
  }
      
    public static void repetido(int numeros[], int longitud) {      
        int[] repeticiones = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            for (int j = i + 1; j < longitud; j++) {
                if (numeros[i] == numeros[j]) {
                    repeticiones[i]++;
                }
            }
        }
          System.out.println("numeros repetidos");
        for (int i = 0; i < longitud; i++) {
            if (repeticiones[i] > 0) {
                System.out.println(numeros[i]);
            }
        }
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int op=1;
        System.out.println("ingrese el largo de lista");
        int indice=teclado.nextInt();
        int array[]=new int[indice];
             for(int i=0;i<indice;i++){
                   System.out.println("ingrese un valor a la lista");
                   array[i]=teclado.nextInt();
                 }
        
        while(op!=0){
            System.out.println("-------MENU----------");
         System.out.println("1_FALTANTE");
           System.out.println("2_ORDENAR ARRAY");
           System.out.println("3_MENORES 1Y2 ");
          System.out.println("4_REVERSA");
           System.out.println("5_ORDENAR ASCENDENTE EN LINEA");
           System.out.println("6_ORDENAR SALTEADO");
            System.out.println("7_MULTIPLICAR VALORES");
           System.out.println("8_BUSCAR");
           System.out.println("9_MAYOR");
            System.out.println("10_MOSTRAR REPETIDO");
           System.out.println("0_SALIR");
           System.out.println("INGRESE UNA OPCION"); 
           op=teclado.nextInt();
           switch(op){
               case 1: faltante(array,indice);
                   break;
               case 2: ordenar(array,indice);
                   break;
               case 3: minimos(array, indice);
                   break;
               case 4: reversa(array, indice);
                   break;
               case 5: ordenrev(array, indice);
                   break;
               case 6: ordenarsalteado(array, indice);
                   break;
               case 7: multiplicar(array, indice);
                   break;
               case 8: buscar(array, indice);
                   break;
               case 9: mayor(array, indice);
                   break;
               case 10: repetido(array, indice);
                   break;           
           }
        }
    }
}
