/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califa;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_2_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int calificacion ;
        
        Scanner captu = new Scanner(System.in);
         System.out.println("EL MINIMO APROVATORIO ES 70");
         calificacion = captu.nextInt();
        
            if(calificacion>=70){
            System.out.println("calificacion aprovatoria");
            }else{
                  System.out.println("reprobo");
    }
    }
}
