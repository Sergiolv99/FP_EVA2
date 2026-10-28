/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_ahorro;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_34_AHORRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner(System.in);

        int ahorro= 15000;
        int deposito;
        int cuenta = 0;
        while(true){
            System.out.println("Introduce el deposito");
            deposito = captu.nextInt();
            captu.nextLine();
            // Verificar si no nos estamos pasando
            if((cuenta + deposito) > 15000){
                 System.out.println("te pasaste de la meta");
                 continue;
            }
            cuenta+= deposito;
            System.out.println("Cuenta =" + cuenta);
             if(cuenta == 15000){
                 System.out.println("Meta Cumplida");
                 break;
             
            }
        }
       
    }
    
}
