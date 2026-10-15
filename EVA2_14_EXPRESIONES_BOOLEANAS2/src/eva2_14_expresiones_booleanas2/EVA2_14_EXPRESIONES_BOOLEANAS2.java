/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //BECA
      //PROMEDIO >= 95
      //ESTA EN ESTE EQUIPO REPRESENTATIVO
      //CAPTURA
      String equipo;
      int promedio;
       Scanner captu = new Scanner(System.in);
       
       System.out.println("equipo representativo: ");
        equipo = captu.nextLine();
        System.out.println("Cual es tu promedio: ");
        promedio = captu.nextInt();
        
        if((promedio>=95)|| equipo.equals("S")){
      System.out.println("beca concedida: ");
      
   }else{
      System.out.println("Beca denegada: ");
      }
      
   }
   
}
