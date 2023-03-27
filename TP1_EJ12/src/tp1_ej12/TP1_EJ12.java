/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_ej12;
import java.util.Scanner;
/**
 *
 * @author Sans
 */
public class TP1_EJ12 {
    public static void modulo2(){
      Scanner teclado=new Scanner(System.in);
      int num=teclado.nextInt();
      int d,acu=0;
      while(num!=0){
        d=num%10;
        num=num/10;
        acu=acu+d;
      }
      System.out.println(acu);
    }
    public static void modulo4(){
      Scanner teclado=new Scanner(System.in);
      int n=teclado.nextInt();
      int v[];
      int i,par=0,impar=0;
      v=new int [n];
      for(i=0;i<n;i++){
        v[i]=teclado.nextInt();
        if(v[i]%2==0) par=par+v[i];
        else impar=impar+v[i];
      }
      System.out.println(impar);
      System.out.println(par);
    }
    public static void modulo5(){
      Scanner teclado=new Scanner(System.in);
      int n=teclado.nextInt();
      int n1=teclado.nextInt();
      System.out.println(2*(n+n1));
    }
    public static void modulo6(){
      Scanner teclado=new Scanner(System.in);
      int age=teclado.nextInt();
      System.out.println(365*age);
    }
    public static void modulo7(){
      Scanner teclado=new Scanner(System.in);
      int a=teclado.nextInt();
      int b=teclado.nextInt();
      if(a+b<100) System.out.println("true");
      else System.out.println("false");
    }
    public static void modulo8(){
              Scanner teclado=new Scanner(System.in);
      int posu,posc;
      String correo,aux,aux1,usuario,compania;
      correo=teclado.next();
      posu=correo.indexOf("@");
      posc=correo.indexOf(".com");
      if(posu>0){
        aux=correo.substring (0,posu);
        usuario=new String(aux.substring(0,1).toUpperCase());
        usuario=usuario.concat(aux.substring(1,aux.length()));
        aux1=correo.substring(posu+1,posc);
        compania=new String(aux1.substring(0,1).toUpperCase());
        compania=compania.concat(aux1.substring(1,aux1.length()));
        System.out.println("Hi " +usuario+ ", Welcome to "+compania);
      }
    }
    public static void modulo9(int a){
      int i;
      int v[];
      v=new int[a];
      for(i=0;i<a;i++){
        if(i==0){
          v[i]=0;
        }
        else if (i==1){ 
          v[i]=1;
        }
        else{
          v[i]=v[i-1]+v[i-2];
        }
      }
      System.out.print(v[0]);
      for(i=1;i<a;i++){
        System.out.print(", "+v[i]);
      }
    }
    public static int modulo10(int numero){
      if(numero==0)return 1;
      else return numero*modulo10(numero-1);
    }
    public static void modulo11(){
      Scanner teclado=new Scanner(System.in);
      String cad,cad2;
      cad=teclado.next();
      cad2=new String(cad.substring(1,cad.length()-1));
      System.out.println(cad2);
    }
    public static void modulo13(){
      Scanner teclado=new Scanner(System.in);
      int a=teclado.nextInt();
      System.out.println(60*a);
    }
    public static void modulo14(){
      Scanner teclado=new Scanner(System.in);
      int a=teclado.nextInt();
      int b=teclado.nextInt();
      System.out.println((a*b)/2);
    }
    public static void modulo15(){
      Scanner teclado= new Scanner(System.in);
      int a= teclado.nextInt();
      int b,sum=0;
      b=a;
      while(a!=0){
        sum=(sum*10)+a%10;
        a=a/10;
      }
      if(sum==b) System.out.println("TRUE");
      else System.out.println("FALSE");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int op=90,b;
       while(op!=0){
           System.out.println("2:Suma de digitos");
           System.out.println("4:Suma de los Impares Y Pares de un vector");
           System.out.println("5:Calcula El perimetro de un rectangulo");
           System.out.println("6:Convierte edad a dias");
           System.out.println("7:Suma de Dos numero Menores a 100?");
           System.out.println("8:Imprimene el nombre de el correo Electronico");
           System.out.println("9:Sucesion de Fibonachi");
           System.out.println("10:Factorial De un numero");
           System.out.println("11:Remover el primer y ultimo caracter de una palabra");
           System.out.println("13:Convertir minutos en segundos");
           System.out.println("14:Calcular el area de un triangulo");
           System.out.println("15:Verificar si un numero es palindromo");
           op=teclado.nextInt();
           switch(op){
               case 2:modulo2();
                      break;
               case 4:modulo4();
                      break;
               case 5:modulo5();
                      break;
               case 6:modulo6();
                      break;
               case 7:modulo7();
                      break;
               case 8:modulo8();
                      break;
               case 9:System.out.println("Ingrese hasta donde la sucesion: ");
                      b=teclado.nextInt();
                      modulo9(b);
                      break;
               case 10:System.out.println("Ingese el numero a sacar factorial: ");
                       b=teclado.nextInt();
                       modulo10(b);
                       break;
               case 11: modulo11();
                        break;
               case 13: modulo13();
                        break;
               case 14:modulo14();
                       break;
               case 15:modulo15();
                       break;
                
           }
    }
    
}
}
