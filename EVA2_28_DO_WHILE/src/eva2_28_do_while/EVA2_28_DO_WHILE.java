/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_do_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_28_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String use, pdw;
        final String USUARIO ="admin";
       final String CONTRA ="1234";
        
        do{
            System.out.println("usuarios:");
            use = captu.nextLine();
            System.out.println("contraseña:");
            pdw = captu.nextLine();
            
        }while(!(use.equals(USUARIO)) || !(pdw.equals (CONTRA)));
        
        System.out.println("Acceso consedido:");
    
    
    
        }
    
}
