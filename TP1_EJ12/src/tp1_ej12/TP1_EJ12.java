/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej12;
import java.util.*;
/**
 *
 * @author David
 */
public class TP1_EJ12 {
    public static void modulo1(){
        
    }
    public static void modulo2(){
        Scanner teclado=new Scanner(System.in);
      int num=teclado.nextInt();
      int acu=0;
      int d;
      while(num!=0){
        d=num%10;
        num=num/10;
        acu+=d;
      }
      System.out.println(acu);
    }
    public static void modulo3(){
        Scanner teclado = new Scanner(System.in);
      int num=teclado.nextInt();
      int aux,s=1,e=0,i;

      aux=num;
      while(aux!=0){
        aux=aux/10;
        e++;
      }
      for(i=0;i<e;i++){
        num=num+s;
        s=s*10;
      }
      System.out.println(num);
    }
    public static void modulo4(){
        Scanner teclado = new Scanner(System.in);
      int i,sp=0,si=0;
      int n=teclado.nextInt();
      int M[];
      
      M = new int[n];
      
      for(i=0;i<n;i++){
        M[i]=teclado.nextInt();
      }
     
      for(i=0;i<n;i++){
        if(M[i]%2==0)sp=sp+M[i];
        else si=si+M[i];
      }
      System.out.println(si);
      System.out.println(sp);
    }
    public static void modulo5(){
      Scanner teclado = new Scanner(System.in);
      int l=teclado.nextInt();
      int w=teclado.nextInt();
      int a;
      a=2*(l+w);
      System.out.println(a);
    }
    public static void modulo6(){
      Scanner teclado = new Scanner(System.in);
      int anio=teclado.nextInt();
      int dia;
      dia=anio*365;
      System.out.println(dia);
    }
    public static void modulo7(){
      Scanner teclado = new Scanner(System.in);
      int num1= teclado.nextInt();
      int num2= teclado.nextInt();
      int s;
      s=num1+num2;
      if (s<100) System.out.println(true);
      else System.out.println(false);
    }
    public static void modulo8(){
        Scanner teclado = new Scanner(System.in);
      int posA,posP;
      String correo,usuario,auxu,compania,auxc;
      
      correo = teclado.next();
      posA = correo.indexOf("@");
      posP = correo.indexOf(".com");
      
      if(posA>0){
        auxu = correo.substring(0,posA);
        usuario = new String (auxu.substring(0,1).toUpperCase());
        usuario = usuario.concat(auxu.substring(1,auxu.length()));
        
        auxc = correo.substring(posA+1,posP); 
        compania = new String(auxc.substring(0,1).toUpperCase());
        compania = compania.concat(auxc.substring(1,auxc.length()));
        System.out.println("Hi " + usuario + ", Welcome to " + compania);
      }
    }
    public static void modulo9(){
        
    }
    public static void modulo10(){
        Scanner teclado = new Scanner(System.in);
      
    int n,fac,i;
    n = teclado.nextInt();
      
    fac=1;
    for(i=1;i<=n;i++){
        fac=fac*i;
      }
    System.out.println(fac);
    }
    public static void modulo11(){
    Scanner teclado = new Scanner(System.in);
    String palabra,aux;
    
    palabra= teclado.next();
    
    aux= palabra.substring(1,palabra.length()-1);
    
    System.out.println(aux);
    }
    public static void modulo12(){
        
    }
    public static void modulo13(){
      Scanner teclado = new Scanner(System.in);
      int minutos=teclado.nextInt();
      
      int segundos;
      segundos=minutos*60;
      System.out.println(segundos);
    }
    public static void modulo14(){
      Scanner teclado = new Scanner(System.in);
      int base=teclado.nextInt(),altura=teclado.nextInt(),area;
      
      area=(base*altura)/2;
      System.out.println(area);
    }
    public static void modulo15(){
      Scanner teclado = new Scanner(System.in);
      int num=teclado.nextInt();
      int invertir=0,d,aux;
      
      aux=num;
      while(num!=0){
        d=num%10;
        invertir=invertir*10+d;
        num=num/10;
      }
      boolean b;
      if(invertir==aux) System.out.println("TRUE");
      else System.out.println("FALSE");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n;
        do{
            System.out.println("MENU\n");
            System.out.println("0: Salir\n");
            System.out.println("1: Ordenar nombres en orden alfabético\n");
            System.out.println("2: Imprimir la suma de los dígitos de un número dado\n");
            System.out.println("3: Incrementar los dígitos de un número en 1\n");
            System.out.println("4: Imprimir la suma de números pares e impares presentes en una Array\n");
            System.out.println("5: Calcular perímetro de un Rectángulo\n");
            System.out.println("6: Convertir la edad en número de días\n");
            System.out.println("7: Comprobar si la suma de dos números es menor que 100\n");
            System.out.println("8: Imprimir Hola nombre de usuario, bienvenido a companyName de email-id\n");
            System.out.println("9: Imprimir serie fibonacci\n");
            System.out.println("10: Factorial de un número dado\n");
            System.out.println("11: Eliminar el primer y último carácter de una cadena\n");
            System.out.println("12: Cuente los caracteres repetitivos presentes en una cadena\n");
            System.out.println("13: Convertir Minutos en Segundos\n");
            System.out.println("14: calcular el area de un triangulo\n");
            System.out.println("15: Comprobar si un número dado es palíndromo o no\n");
            System.out.println("Seleccione una opcion:");
            n=teclado.nextInt();
            switch(n){
                case 1 -> modulo1();
                case 2 -> modulo2();
                case 3 -> modulo3();
                case 4 -> modulo4();
                case 5 -> modulo5();
                case 6 -> modulo6();
                case 7 -> modulo7();
                case 8 -> modulo8();
                case 9 -> modulo9();
                case 10 -> modulo10();
                case 11 -> modulo11();
                case 12 -> modulo12();
                case 13 -> modulo13();
                case 14 -> modulo14();
                case 15 -> modulo15();
            }
        } while(n!=0);
    }
    
}
