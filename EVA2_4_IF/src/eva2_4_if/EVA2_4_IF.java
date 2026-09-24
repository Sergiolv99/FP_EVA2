/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_if;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EVA2_4_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double total,salario, bono;
        String nombre; 
        
        Scanner captu= new Scanner(System.in);
        
         System.out.println("nombre del empleado");
         nombre= captu.nextLine();
         
             
         System.out.println("Salario del empleado");
         salario= captu.nextDouble();
         
        if (salario >= 12000) {
        bono = salario * 0.10;
        
        } else {
        bono = salario * 0.05;
}

         total = salario + bono;

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Bono: " + bono);
        System.out.println("Total: " + total);
        
    }
    
    }
    

