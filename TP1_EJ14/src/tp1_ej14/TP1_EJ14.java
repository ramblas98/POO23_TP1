/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej14;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author profeblas
 * 
 * Ejercicio 14. Resuelve colaborativamente el siguiente programa en Java para 
 * generar una sopa de letras y determinar si una palabra dada se encuentra en ella. 
 * Resuelve con métodos para cada inciso:
 * 
 * a) Generar una matriz de caracteres aleatorios, recibiendo como argumentos: el 
 * número de filas, el número de columnas y el rango de valores permitidos (rango 
 * al que deben pertenecer los caracteres aleatorios que se elijan como valores). 
 * Por ejemplo:
 *              ▪ M = 8; N = 10 (M: Filas - N: Columnas)
 *              ▪ 65 ≤ A[i, j] ≤ 90 (Código ASCCII)
 * 
 * b) Obtener (leer) el carácter de una casilla de una sopa de letras dada.
 * 
 * c) Establecer (escribir) el carácter de una casilla de una sopa de letras dada.
 * 
 * d) Comprobar si unas coordenadas dadas (número de fila y columna) corresponden 
 * a una casilla válida de una sopa de letras dada.
 * 
 * e) Comprobar si una palabra dada está en una determinada posición (coordenadas 
 * de inicio de búsqueda) en una sopa de letras. Sugerencia: Escribir métodos para 
 * realizar búsqueda en los sentidos de los puntos cardinales 
 * (NORTE, SUR, ESTE, OESTE, NO, NE, SO y SE).  
 * 
 */
public class TP1_EJ14 {

    private static char sopa[][];
    
    private static char caracterAleatorio(){
        // 65 ≤ A[i, j] ≤ 90 (Código ASCCII)
        int ini = 65, fin = 90;
        return (char)(Math.random()*(fin-ini+1)+ini );
    }
    
    private static char obtener(int f, int c){
        return sopa[f][c];
    }
    
    private static void establecer(int f, int c, char car){
        sopa[f][c] = car;
    }
    
    private static boolean coordenadaValida(int f, int c){
        return ((f>=1)&&(c>=1)&&(f<=8)&&(c<=10) );
    }
    
    private static boolean buscarNorte(String p,int f, int c){
        //... 
        return false;
    }
    
    private static boolean buscarSur(String p,int f, int c){
        //... 
        return false;
    }
    
    private static boolean buscarEste(String p,int f, int c){
        //... 
        return false;
    }
    
    private static boolean buscarOeste(String p,int f, int c){
        //... 
        return false;
    }
    
    private static boolean buscarNO(String p,int f, int c){
        //... 
        return false;
    }
    
    private static boolean buscarNE(String p,int f, int c){
        //... 
        return false;
    }
    
    private static boolean buscarSO(String p,int f, int c){
        //... 
        return false;
    }
    
    private static boolean buscarSE(String p,int f, int c){
        //... 
        return false;
    }
    
    private static boolean buscarPalabra(String p,int f, int c){
        return ((coordenadaValida(f,c)&&
                ( buscarNorte(p,f,c) || 
                  buscarSur(p,f,c) ||
                  buscarEste(p,f,c) ||
                  buscarOeste(p,f,c) ||
                  buscarNO(p,f,c)    || 
                  buscarNE(p,f,c) ||
                  buscarSO(p,f,c) ||
                  buscarSE(p,f,c) ) ));
    }
            
    private static char[][] crearSopa(int m, int n){
        char s[][];
        int f,c;
        
        s = new char[m][n];
        for(f=0;f<m;f++)
            for(c=0;c<n;c++){
                s[f][c] = caracterAleatorio();
            }
        
        return s;
    }
    
    private static void mostrarSopa(char s[][]){
        
        System.out.println("SOPA GENERADA");
        System.out.println("");
        for(int f=0;f<s.length;f++){
            for(int c=0;c<s[0].length;c++){
                System.out.print(s[f][c] + " ");
            }
            System.out.println("");
        }
        System.out.println("");   
    }
    
    private static char[] devolver(int n){
        char res[];
        res = new char[n];
        Arrays.fill(res,' ');
        return res;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sopa de letras");
        sopa = crearSopa(8,10);
        mostrarSopa(sopa);
        
        System.out.print("Ingrese palabra a buscar: ");
        String p = teclado.next();
        System.out.println("Ingrese las coordenadas de busqueda");
        System.out.print("- desde Fila: ");
        int f = teclado.nextInt();
        System.out.print("- desde Columna: ");
        int c = teclado.nextInt();
        
        if (buscarPalabra(p,f,c)==true)
            System.out.println("La palabra SI se encuentra.-");
        else
            System.out.println("La palabra NO se encuentra.-");
    }
    
}
