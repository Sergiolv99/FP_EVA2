/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad ;
        
        Scanner captu = new Scanner(System.in);
         System.out.println("¿CUAL ES TU EDAD?");
         edad = captu.nextInt();
        
            if(edad>=18){
            System.out.println("puedes entrar");
            }else{
                  System.out.println("no puedes entrar");
            }
    }
    
}
