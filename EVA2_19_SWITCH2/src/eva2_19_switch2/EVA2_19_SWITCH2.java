/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_switch2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_19_SWITCH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
        System.out.println("introduce el numero del dia [1-7]");
        String Carrera = captu.nextLine();
        
        switch(Carrera){
            case "Sistemas":
            System.out.println("ICS");
            break;//
             case "Informatica":
            System.out.println("IN");
            break;//
             case "Administracion":
            System.out.println("AD");
            break;//
            
          
            
        
    }
    }
    
}
