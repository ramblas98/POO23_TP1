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
      teclado.nextLine();
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
     int n1=0,n2=1,n3,i,count=10;    
    System.out.print(n1+" "+n2);//printing 0 and 1    
    
    for(i=2;i<count;++i) {    
    n3=n1+n2;    
    System.out.print(" "+n3);    
    n1=n2;    
    n2=n3;  }   
    }
    
    public static void modulo10(){
    int i,fact=1;  
    int number=5;//It is the number to calculate factorial    
    for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
    }
    
    public static void modulo11(){
      Scanner teclado = new Scanner(System.in);
      String cad;
      cad = teclado.next();
      
      cad = cad.substring(1,cad.length()-1);
      System.out.println(cad);
    }
    
    public static void modulo12(){
      Scanner teclado = new Scanner(System.in);
      String mensaje;
      String caracter;
      String caracter2;
      int contador;
      
      mensaje = teclado.next();
      
      for(int i = 0; i < mensaje.length(); i++){
        contador = 0;
        caracter = mensaje.substring(i,i+1);
        for(int j = 0; j < mensaje.length(); j++){
          caracter2 = mensaje.substring(j,j+1);
          if(caracter.equals(caracter2) == true){
            contador++;
        }
      }
      if(contador > 1){
        System.out.print(caracter+":"+contador+", ");
        }
    }
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
        
        
        Scanner teclado = new Scanner(System.in);
        int N;
        
    
        
        do{
            System.out.println("Selecciona un programa:\n0_Exit\n1_Sort names in an alphabetical Order\n2_Print the sum of the digits of a given number\n3_Increment the digits of a number by 1\n4_Print the sum of odd and even numbers present in an array\n5_Calculate perimeter of a Rectangle\n6_Convert age into number of days\n7_Check if sum of two numbers is less than 100?\n8_Print Hi UserName, Welcome to companyName from email-id\n9_Print fibonacci series\n10_Factorial of a given number\n11_Remove first and last character from a string\n12_Count the repetitive characters present in a string\n13_Convert Minutes into Seconds\n14_Calculate area of a triangle\n15_Check if a given number is palindrome or not");
            N = teclado.nextInt();
            
            switch(N){
                case 1:
                    modulo1();
                    break;
                case 2:
                    modulo2();
                    break;
                case 3:
                    modulo3();
                    break;
                case 4:
                    modulo4();
                    break;
                case 5:
                    modulo5();
                    break;
                case 6:
                    modulo6();
                    break;
                case 7:
                    modulo7();
                    break;
                case 8:
                    modulo8();
                    break;
                case 9:
                    modulo9();
                    break;
                case 10:
                    modulo10();
                    break;
                case 11:
                    modulo11();
                    break;
                case 12:
                    modulo12();
                    break;
                case 13:
                    modulo13();
                    break;
                case 14:
                    modulo14();
                    break;
                case 15:
                    modulo15();  
                    break;
                default:
                    return;
            }
        } while(N != 0);
    }
    
}
