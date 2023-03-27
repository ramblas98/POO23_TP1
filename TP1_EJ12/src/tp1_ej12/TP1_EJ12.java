/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_ej12;

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
         System.out.
        }
      
    
}
