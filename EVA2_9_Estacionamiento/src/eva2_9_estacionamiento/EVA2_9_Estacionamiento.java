/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_9_Estacionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int Estacionamiento,costo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Solicita el numero de horas de estacionamiento:");
        Estacionamiento = captu.nextInt();
        
         if(Estacionamiento <= 2){
                System.out.println("$25 por hora");
                costo = Estacionamiento * 25;
                System.out.println("total:"+costo);
            }
          else if(Estacionamiento <=5){
                System.out.println("$20 por hora");
                costo = Estacionamiento * 20;
                System.out.println("total:"+costo);
                }
        else if(Estacionamiento <=10){
                System.out.println("$15 por hora");
                costo = Estacionamiento * 15;
                System.out.println("total:"+costo);
                }
         else if(Estacionamiento >=11){
                System.out.println("tarifa fija de $150");
                costo = 150;
                System.out.println("total:"+costo);
                }
         
    }
    
}
