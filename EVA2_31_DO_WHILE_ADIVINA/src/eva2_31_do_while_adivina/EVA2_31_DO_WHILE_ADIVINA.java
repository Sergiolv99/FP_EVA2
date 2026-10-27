/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivina;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_31_DO_WHILE_ADIVINA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);

        int numero;
        
       do{
           
            System.out.println("Di un numero del 1-100");
            numero = captu.nextInt();
            captu.nextLine();
              
        }while(numero != 5);
         System.out.println("no pongas ese numero");
        
        }
    
}
