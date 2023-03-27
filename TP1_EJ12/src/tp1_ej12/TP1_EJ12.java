/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej12;
import java.util.*;
/**
 *
 * @author Cossio Carina
 */
public class TP1_EJ12 {
    //MODULOS
    public static void modulo1(){
        Scanner teclado=new Scanner(System.in);
      int n=teclado.nextInt();
      String[] arreglo=new String [n];
      
      for(int i=0 ; i<n ; i++){
        arreglo[i]=teclado.next();
      }
      Arrays.sort(arreglo);
      
      for(int i=0 ; i<n ; i++){
        System.out.println(arreglo[i]);
    }}
    
    public static void moduclo2(){
      Scanner teclado=new Scanner (System.in);
      int num=teclado.nextInt();
      int acum,d;
      acum=0;
      while(num!=0){
        d=num%10;
        num=num/10;
        acum=acum+d;
      }
      System.out.println(acum);  
    }
    public static void modulo3(){
        Scanner teclado=new Scanner(System.in);
      int num=teclado.nextInt();
      int dig1,dig2,acum,inv;
      inv=0;
      while(num!=0){
        dig1=num%10;
        if(dig1==9) dig1=0;
        else dig1++;
        num=num/10;
        inv=inv*10+dig1;
      }
      acum=0;
      while(inv!=0){
        dig2=inv%10;
        inv=inv/10;
        acum=acum*10+dig2;
      }
      System.out.println(acum);
    }
    public static void modulo4(){
        Scanner teclado = new Scanner(System.in);
        int v[];
        int par=0,impar=0,n,i;
        n=teclado.nextInt();
        v=new int[n];
        for (i=0; i<n; i++) {
            v[i] = teclado.nextInt();
        }
        for (i=0; i<n; i++) {
            if (v[i]%2==0) {
                par+=v[i];
            } else {
                impar+=v[i];
            }
        }
        System.out.println(par);
        System.out.println(impar);
    }
    public static void modulo5(){
        Scanner teclado=new Scanner(System.in);
      int l=teclado.nextInt();
      int w=teclado.nextInt();
      int peri;
      peri=2*(l+w);
      System.out.println(peri);
    }
    public static void modulo6(){
        Scanner teclado=new Scanner(System.in);
      int edad=teclado.nextInt();
      
        edad=edad*365;
      
      System.out.println(edad);
    }
    public static void modulo7(){
    Scanner teclado=new Scanner(System.in);
      int num1=teclado.nextInt();
      int num2=teclado.nextInt();
      int sum;
      sum=num1+num2;
      if (sum<100) System.out.println("true");
      else System.out.println("false");
    }
    public static void modulo8(){
     Scanner teclado=new Scanner(System.in);
      int posA,posP;
      String correo,usuario,auxu,compania,auxc;
      
      correo = teclado.next();
      posA = correo.indexOf("@");
      posP = correo.indexOf(".com");
      
       if(posA>0){
         auxu = correo.substring(0,posA);
         usuario = new String(auxu.substring(0,1).toUpperCase());
         usuario = usuario.concat(auxu.substring(1,auxu.length()));
         
         auxc = correo.substring(posA+1,posP);
         compania = new String(auxc.substring(0,1).toUpperCase());
         compania = compania.concat(auxc.substring(1,auxc.length()));
         System.out.println("Hi "+ usuario + ", Welcome to " + compania);
    }}
    public static void modulo9(){
    public static int factorial(int n){
    if(n==0) return 1;
    else return n*factorial(n-1);
  }
    public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     int n=teclado.nextInt();
     System.out.println(factorial(n));
    }
       
      
       
       

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // TODO code application logic here
        int op=99;
        
        while(op!=0){
         System.out.println("MENU: ");
         System.out.println("1:Ingresar una cadena y ordenarla alfabaeticamente");
         System.out.println("2: Suma de los digistos de un numero");
         System.out.println("3: Incrementa los digitos de un numero +1");
         System.out.println("4: Sumar pares e impares de un vector");
         System.out.println("5: Calcula el perimetro de un traingulo");
         System.out.println("6: Convierte anios en cantidad de dias");
         System.out.println("7: Indicar si dos numeros sumados son menores que 100");
         System.out.println("8: Muestra nombre y compania de un email");
         System.out.println("10: Factorial de un numero ingresado");
         
         switch(op){
             case 1: modulo1; break;
             case 2: modulo2; break;
             case 3: modulo3; break;
             case 4: modulo4; break;
             case 5: modulo5; break;
             case 6: modulo6; break;
             case 7: modulo7; break;
             case 8: modulo8; break;
             case 10: modulo10; break;
         }
             
         }
        }
      
    
}
