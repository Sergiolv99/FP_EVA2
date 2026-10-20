/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_20_EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Calculadora
        //Pedir dos valores enteros
        //pedir operacion:usar switch
        //
        
          Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el primer valor entero:");
        double val1 = captu.nextInt();
        System.out.println("Introduce el segundo valor entero:");
        double val2 = captu.nextInt();
        
        

       
        System.out.println("Introduce la operacion (1: Suma, 2: Resta, 3: Multiplicacion, 4: Division):");
        int operacion = captu.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + (val1 + val2));
                 System.out.println("Es vergonzoso que no sepas sumar: ");
                break;
            case 2:
                System.out.println("Resultado: " + (val1 - val2));
                System.out.println("Es vergonzoso que no sepas restar: ");
                break;
            case 3:
                System.out.println("Resultado: " + (val1 * val2));
                System.out.println("te la perdono: ");
                break;
            case 4:
               
                    System.out.println("Resultado: " + (val1 / val2));
                    System.out.println("te la perdono");
                
                break;
            default:
                System.out.println("Operación inválida");
                break;
        }
    }
    
}
