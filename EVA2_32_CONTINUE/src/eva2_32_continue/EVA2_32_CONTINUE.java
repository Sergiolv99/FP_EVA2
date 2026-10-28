/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_continue;

/**
 *
 * @author Usuario
 */
public class EVA2_32_CONTINUE {

    /**
     * @param args the command line arguments
     */
    // Continue
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 0; i <=20; i++){
            System.out.print(i  + "-");
            
            int residuo = 1% 2;
            if(residuo == 0){
                System.out.print( i + "_-");
                continue;
            }
            System.out.print( "Si el numero es par esto no se imprime");
        }
    }
    
}
