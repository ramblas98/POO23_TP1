/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej12;
import java.util.*;

/**
 *
 * @author diego27
 */
public class TP1_EJ12 {
    
    public static void modulo1(){
      Scanner teclado = new Scanner(System.in);
    
      int size = teclado.nextInt();
      size++;
      int i;
      
      String[] array = new String[size];
      
      for(i = 0; i < array.length; i++){
        array[i] = teclado.nextLine();
      }
      
      Arrays.sort(array);
      
     for(i = 0; i < array.length; i++){
       System.out.println(array[i]);
     }
    }
    
    public static void modulo2(){
      Scanner teclado = new Scanner(System.in);
      
      int num = teclado.nextInt();
      int acum = 0,d;
      
      while(num != 0){
        d = num % 10;
        num = num / 10;
        acum += d;
      }
      
      System.out.println(acum);
    }
    
    public static void modulo3(){
    Scanner teclado = new Scanner(System.in);
    int num = teclado.nextInt();
    int add = 1;
  
    for (int i = 0; i < String.valueOf(num).length();i++) {
          num = num + add;
            add = add * 10;
        }
        
    System.out.println(num);
    }
    
    public static void modulo4(){
      Scanner teclado = new Scanner(System.in);
      
      int i = 0,np=0,ni=0;
      int v[];
      
      int size = teclado.nextInt();
      v = new int[size];
      
      for(i=0;i<size; i++){
        v[i] = teclado.nextInt();
      }
      
      for(i=0;i<size;i++){
        if(v[i] % 2 == 0){
          np += v[i];
        }else{
          ni += v[i];
        }
      }
      
      System.out.println(np);
      System.out.println(ni);
    }
    
    public static void modulo5(){
      Scanner teclado = new Scanner(System.in);
      int l = teclado.nextInt();
      int w = teclado.nextInt();
      int res;
      
      res = 2*(l + w);
      System.out.println(res);
    }
    
    public static void modulo6(){
      Scanner teclado = new Scanner(System.in);
      
      int age = teclado.nextInt();
      int res;
      res = age * 365;
      System.out.println(res);
    }
    
    public static void modulo7(){
      Scanner teclado = new Scanner(System.in);
      
      int num1 = teclado.nextInt();
      int num2 = teclado.nextInt();
      
      int sum = 0;
      sum = num1 + num2;
      boolean output;
      output = sum < 100;
      
      System.out.println(output);
    }
    
    public static void modulo8(){
      Scanner teclado = new Scanner(System.in);
      
      int posA,posB;
      String correo,usuario,auxu,compania,auxc;
      
      correo = teclado.next();
      posA = correo.indexOf("@");
      posB = correo.indexOf(".com");
      
      
      // Si posicion A es mayor a 0 quiere decir que es un email valido      
      if (posA>0){
        auxu = correo.substring(0,posA);
        usuario = auxu.substring(0,1).toUpperCase();
        usuario = usuario.concat(auxu.substring(1,auxu.length()));
        
        auxc = correo.substring(posA+1,posB);
        compania = auxc.substring(0,1).toUpperCase();
        compania = compania.concat(auxc.substring(1,auxc.length()));
        System.out.println("Hi " + usuario + ", Welcome to " + compania);
      }
    }
    
    public static void modulo9(){
        
    }
    
    public static void modulo10(){
  
    }
    
    public static void modulo11(){
      Scanner teclado = new Scanner(System.in);
      String cad;
      cad = teclado.next();
      
      cad = cad.substring(1,cad.length()-1);
      System.out.println(cad);
    }
    
    public static void modulo12(){
        
    }
    
    public static void modulo13(){
      Scanner teclado = new Scanner(System.in);
      int num = teclado.nextInt();
      num *= 60;
      System.out.println(num);
    }
    
    public static void modulo14(){
      Scanner teclado = new Scanner(System.in);
      int b = teclado.nextInt();
      int h = teclado.nextInt();
      int res = 0;
      
      res = (b * h) / 2;
      
      System.out.println(res);
    }
    
    public static void modulo15(){
      Scanner teclado = new Scanner(System.in);
      int num = teclado.nextInt();
      int copy = num;
      int inv = 0;
      int d;
      
      while(copy != 0){
        d = copy % 10;
        inv = inv * 10 + d;
        copy = copy / 10;
      }
      
      if(inv == num){
        System.out.println("TRUE");
      }else{
        System.out.println("FALSE");
      }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
    
}
