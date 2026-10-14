/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_10_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificacion ;
        Scanner captu = new Scanner(System.in);
        System.out.println("Solicita el promedio del estudiante:");
        calificacion = captu.nextInt();
        
        if(calificacion <0){
                System.out.println("eso es imposible y si lo lograstes eres un verdadero idiota");
                
            }
          else if(calificacion <70){
                System.out.println("Insuficiente");
                
                }
        else if(calificacion <=80){
                System.out.println("Aceptable");
               
                }
         else if(calificacion >=90){
                System.out.println("Sobresaliente");
               
                }
         else if(calificacion >100){
                System.out.println("eso es imposible");
               
                }
         
    }
    
}
