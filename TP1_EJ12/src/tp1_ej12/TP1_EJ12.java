/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej12;
import java.util.*;
/**
 *
 * @author medin
 */
public class TP1_EJ12 {
    public static void modulo1(String[] args) {
      
      Scanner teclado=new Scanner(System.in);
      int n;
      String v[];
      
      n = teclado.nextInt();
      v = new String[n];
      
      for(int i=0;i<n;i++){
        v[i]=teclado.next();
      }
      
      Arrays.sort(v);
      for(int i=0;i<n;i++){
        System.out.println(v[i]);
      }
  }
    public static void modulo2(String[] args) {
      
      Scanner teclado=new Scanner(System.in);
      int num=teclado.nextInt();
      int acu=0;int d;
      while (num!=0){
        d=num%10;
        num=num/10;
        acu += d;
        
      }
      System.out.println(acu);
      
  }
    public static void modulo3(String[] args) {
      
      Scanner teclado=new Scanner(System.in);
      int num=teclado.nextInt();
      int e=1,d,resul=0;
      while(num!=0){
        d=(num%10)+1;
        if (d==10){
          d=0;
        }
        num=num/10;
        d=d*e;
        resul += d;
        e*=10;
      }
      
      
      System.out.println(resul);
  }
    public static void modulo4(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int sp=0,si=0,i,n;
      int v[];
      
      n = teclado.nextInt();
      v = new int[n];
      
      for(i=0;i<n;i++){
        v[i]=teclado.nextInt();
      }
      
      for (i=0;i<n;i++){
        if (v[i]%2==0){
          sp+=v[i];
        }else{
          si+=v[i];
        }
      }
    
    System.out.println(si);
    System.out.println(sp);
  }
    public static void modulo5(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int resul;
      int num = teclado.nextInt();
      int num2 = teclado.nextInt();
      
      resul= num*2 + num2*2;
      
      System.out.println(resul);
       
  }
    public static void modulo6(String[] args) {
      Scanner teclado=new Scanner(System.in);
      int edad=teclado.nextInt();
      int resul;
      resul=edad*365;
      System.out.print(resul);
    }
    public static void modulo7(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int resul;
      int num = teclado.nextInt();
      int num2 = teclado.nextInt();
      
      resul= num+num2;
      if(resul<100){
        System.out.print(true);
      }else{
        System.out.println(false);
      }
  }
    public static void modulo8(String[] args) {
      
      Scanner teclado=new Scanner(System.in);
      int posA,posP;
      String correo,usuario,auxu,compania,auxc;
      
      correo=teclado.next();
      posA=correo.indexOf("@");
      posP=correo.indexOf(".com");
      
      if (posA>0){
        auxu=correo.substring(0,posA);
        usuario=new String(auxu.substring(0,1).toUpperCase());
        usuario=usuario.concat(auxu.substring(1,auxu.length()));
        
        auxc=correo.substring(posA+1,posP);
        compania=new String(auxc.substring(0,1).toUpperCase());
        compania=compania.concat(auxc.substring(1,auxc.length()));
        System.out.println("Hi "+usuario+", Welcome to "+compania);
        
      }
    }
    public static void modulo9(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int tam=teclado.nextInt();
      int v[];
      v = new int[tam];
      v[0]=0;
      v[1]=1;
      int i;
      for(i=0;i<tam-2;i++){
        v[i+2]=v[i]+v[i+1];
      }
      for(i=0;i<tam;i++){
        System.out.print(v[i]);
        if (i!=tam-1){
          System.out.print(", ");
        }
      }
  }
    public static void modulo10(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fac=teclado.nextInt();
        int i,resul = 1;

        for(i=1;i<=fac;i++){
          resul*=i;

        }
        System.out.println(resul);
    }
    public static void modulo11(String[] args) {
      
      Scanner teclado=new Scanner(System.in);
      String cadena,cadena_modi;
      
      cadena=teclado.next();
      
      cadena_modi=cadena.substring(1,cadena.length()-1);
      
      System.out.println(cadena_modi);
        
      
  }
    public static void modulo12(String[] args) {
      Scanner teclado = new Scanner(System.in);
      String palabra=teclado.next();
      String v[];
      int v2[];
      int tam=0,tamcad=palabra.length();
      v = new String[tamcad];
      v2 = new int[tamcad];
      String letra;
      boolean band;
      for(int i=0;i<tamcad;i++){
        band=false;
        letra=palabra.substring(i,i+1);
        
          
        for(int j=0;j<tam;j++){
          if (letra.equals(v[j])){
            band=true;
            v2[j]+=1;
          }
        }
        if (band==false){
          v[tam]=letra;
          v2[tam]+=1;
          
          tam+=1;
        }
      }
      int cont=0;
      for(int i=0;i<tam;i++){
        if(v2[i]>1){
          if (cont==0){
            cont=1;
          }else{
            System.out.print(", ");
          }
          System.out.print(v[i]+":"+v2[i]);
          
        }
      }
    }
    public static void modulo13(String[] args) {
      
      Scanner teclado = new Scanner(System.in);
      int min=teclado.nextInt();
      int seg;
      seg=min*60;
      System.out.println(seg);
  }
    public static void modulo14(String[] args) {
      
      Scanner teclado = new Scanner(System.in);
      
      int base= teclado.nextInt();
      int altura= teclado.nextInt();
      int resul=(base*altura)/2;
      
      System.out.println(resul);
      
  }
    public static void module15(String[] args) {
      
      Scanner teclado=new Scanner(System.in);
      int numero=teclado.nextInt();
      int aux=numero;
      int d,e=1;
      int resul=0;
      
      while(aux!=0){
          d=(aux%10);
          aux=aux/10;
          resul += d;
          if(aux!=0){
            resul=resul*10;
          }
          
      }
      if (resul==numero){
        System.out.println("TRUE");
      }else{
        System.out.println("FALSE");
      }
    }
    public static void main(){
        Scanner teclado = new Scanner (System.in);
        
        int op=90;
        
        while (op!=0){
            System.out.println("1: ");
            System.out.println("2: Sumar los digitos de un numero");
            System.out.println("3: Incrementa los digitos de ");
            System.out.println("4: Sumar los numeros pares e impares de un vector");
            System.out.println("5: Calcular el perimetro de un rectangulo");
            System.out.println("6: Comvertir una edad en dias");
            System.out.println("7: Saber si la suma de dos numero es menor a 100");
            System.out.println("8: Ingresar un email y que salude al usuario");
            System.out.println("9: Secuencia de Fibonacci");
            System.out.println("10: Factorial de un numero");
            System.out.println("11: Sacar el primer y ultimo caracter de una cadena");
            System.out.println("12: ");
            System.out.println("13: Pasar de minutos a segundos");
            System.out.println("14: Calcular el area de un triangulo");
            System.out.println("15: ");
            System.out.println("------------------------------------------------------");
            System.out.println("Ingresar opccion: ");
            op=teclado.nextInt();
            
            switch(op){
                case 1:
                    
                case 2: 
                    modulo2();
                case 3:
                    modulo3();
                case 4:
                    modulo4();
                case 5:
                    modulo5();
                case 6:
                    modulo6();
            }
            
        }
        
    }
}
