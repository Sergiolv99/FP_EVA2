/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_15_BECA {

    /**
       
     */
    public static void main(String[] args) {
        int promedio, ingresos;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Cual es tu promedio: ");
        promedio = captu.nextInt();
        System.out.println("Cuantos son tus ingresos: ");
        ingresos = captu.nextInt();
        
        if( (promedio >= 80) && ingresos <= 10000){
            System.out.println("Beca concedida!!");
        }else{
            System.out.println("Beca denegada!!");
        }
    }
    
}
