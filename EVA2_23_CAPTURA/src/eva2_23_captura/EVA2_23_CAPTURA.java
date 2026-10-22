/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_captura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_23_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int califa = 0, cant;
        double promedio;
        Scanner captu =new Scanner(System.in);
        System.out.println("Cuanta calificaciones vas a capturar");
        cant= captu.nextInt();
        captu.nextLine();
        for(int i = 0; i < cant; i++ ){
            System.out.println("capturar la calificacion");
            califa= califa +captu.nextInt();
            captu.nextLine();
        }
         System.out.println("Acumulado"+ califa);
         promedio = califa / (cant * 1.0);
          System.out.println("promedio = "+ promedio);
    }
    
}
