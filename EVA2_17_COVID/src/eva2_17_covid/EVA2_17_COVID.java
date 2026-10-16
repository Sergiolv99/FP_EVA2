/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        String enfermedad;
        double peso, estatura, imc;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("¿Cuál es tu edad?");
        edad = captu.nextInt();
        captu.nextLine(); // Limpiar el buffer de lectura
        
        System.out.println("¿Tienes alguna enfermedad crónica? (S/N):");
        enfermedad = captu.nextLine();
        
        System.out.println("¿Cuál es tu peso en Kg?:");
        peso = captu.nextDouble();
        
        System.out.println("¿Cuál es tu estatura en metros (ej. 1.75)?:");
        estatura = captu.nextDouble();
        
        // Cálculo del IMC -> Peso en Kg / (estatura en metros al cuadrado)
        imc = peso / (estatura * estatura);
        System.out.println("Tu IMC es: " + imc);
        
        // Criterios: edad > 65 O enfermedad crónica ("S") O imc >= 25
        if ((edad > 65) || enfermedad.equalsIgnoreCase("S") || (imc >= 25)) {
            System.out.println("Persona de riesgo: SÍ");
        } else {
            System.out.println("Persona de riesgo: NO");
        }
    }
    
}
