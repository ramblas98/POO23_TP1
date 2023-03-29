/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej14;
import java.util.*;
/**
 *
 * @author Cossio Carina
 */
public class TP1_EJ14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Ingrese cantidad de filas");
        int f = teclado.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int c = teclado.nextInt();
        char[][] matriz=new char[f][c];
        //a)_
        for(int i=0 ; i<f ; i++){
        for(int j=0; j<c ; j++){
            int aleatorioInt = rand.nextInt(90-65+1) + 65;
            char aleatorioChar = (char)aleatorioInt;
            matriz[i][j] = aleatorioChar;
        
          }
        }
        //D)_
        System.out.println("Ingrese posicion del caracter a leer:");
        System.out.println("Fila:");
        int posf = teclado.nextInt();
        System.out.println("Columna: ");
        int posc = teclado.nextInt();
        
        if (posf>=0 && posf<f && posc>=0 && posc<c){
            System.out.println(matriz[posf][posc]);
        }
        else System.out.println("Posicion no encontrada");
        
    }
    
}
