/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_menu;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_30_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);

        int opcion;
        
        do{
            System.out.println("----menu----");
            System.out.println("1.Ventas");
            System.out.println("2.Compras");
            System.out.println("3.Provedores");
            System.out.println("4.clientes");
            System.out.println("5.Salir");
            opcion = captu.nextInt();
            captu.nextLine();
              
        }while(opcion != 5);
         System.out.println("Saliendo del sistema");
    }
    
}
