/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuentos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_16_DESCUENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int edad;
        String estudiante, insen;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("¿Cuál es tu edad?");
        edad = captu.nextInt();
        captu.nextLine(); // Limpiar el buffer de lectura
        
        System.out.println("¿Eres estudiante? (S/N):");
        estudiante = captu.nextLine();
        
        System.out.println("¿Tienes credencial del INSEN? (S/N):");
        insen = captu.nextLine();
        
        
        if ((edad <25) || estudiante==("S") || (edad > 60 && insen==("S"))) {
            System.out.println("Descuento concedido");
        } else {
            System.out.println("Descuento denegado");
        }
    }
    
}
