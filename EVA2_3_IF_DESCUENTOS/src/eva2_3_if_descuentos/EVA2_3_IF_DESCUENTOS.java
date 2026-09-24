/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if_descuentos;


import java.util.Scanner;



/**
 *
 * @author bisonte
 */
public class EVA2_3_IF_DESCUENTOS {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio,subtotal,total,cantidad,descuento;
        
        Scanner captu= new Scanner(System.in);
        
         System.out.println("precio del articulo:");
         precio= captu.nextDouble();
         
             
         System.out.println("Cantidad del articulo:");
         cantidad= captu.nextDouble();
         
         subtotal = precio * cantidad;
         descuento = 0; // Inicializar en 0 por si no entra al if

         if (subtotal >= 1000) {
         descuento = subtotal * 0.1;
         } else {
         descuento = 0; 
         }

         total = subtotal - descuento;

         System.out.println("subtotal: " + subtotal);
         System.out.println("descuento: " + descuento);
         System.out.println("total: " + total);
        
        
    }
    
}
