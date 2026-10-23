/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_24_EJERCICIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
      
        // EJERCICIO 1: Números entre un inicio y fin
       
        System.out.println("EJERCICIO 1 ");
        int inicio, fin;
        System.out.println("Introduce el numero inicial:");
        inicio = captu.nextInt();
        System.out.println("Introduce el numero final:");
        fin = captu.nextInt();
        
        for (int i = inicio; i <= fin; i++) {
            System.out.print(i+"-");
        }
        System.out.println("");

        
        // EJERCICIO 2: Patrón de asteriscos con texto
      
        System.out.println("EJERCICIO 2");
        int numPatron;
        System.out.println("Introduce un numero para el patron:");
        numPatron = captu.nextInt();
        
        for (int i = 1; i <= numPatron; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        
        // EJERCICIO 3: Tabla de multiplicar
       
        System.out.println("EJERCICIO 3 ");
        int numTabla, mult = 0;
        System.out.println("Introduce un numero para su tabla de multiplicar:");
        numTabla = captu.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numTabla + " x " + i + " = " + mult);
            mult = numTabla * i;
            
        }
        System.out.println();

        
        // EJERCICIO 4: Calcular la potencia (base y exponente)
       
        System.out.println("--- EJERCICIO 4 ---");
        int base, exponente,resultadoPotencia = 1;
       
        
        System.out.println("Introduce la base:");
        base = captu.nextInt();
        System.out.println("Introduce el exponente:");
        exponente = captu.nextInt();
        
        for (int i = 1; i <= exponente; i--) {
            resultadoPotencia = resultadoPotencia * base;
        }
        
        System.out.println(base + " elevado a la " + exponente + " = " + resultadoPotencia);
    }
}
    
    

