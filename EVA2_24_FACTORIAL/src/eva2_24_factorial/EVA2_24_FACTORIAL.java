/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_24_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        Scanner captu =new Scanner(System.in);
        int  num , facto = 1;
         System.out.println("calcular factorial [5-1]");
         num = captu.nextInt();
        
         for(int i = num; i >= 1; i-- ){
            System.out.println(i);
            facto = facto * i;
            
        }
         System.out.println("factorial de:"+ facto + "");
       
        System.out.println("calcular factorial[1-5]");
         for(int i = 1; i <= num; i++ ){
            System.out.println(i);
            
        }
         System.out.println("factorial de:"+ facto + "");
    }
    
}
