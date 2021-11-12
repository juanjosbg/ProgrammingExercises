/*
Crear una función que permita multiplicar dos números enteros sin utilizar el signo de
multiplicación (*).

 */
package com.mycompany.suma;

import java.util.Scanner;

/**
 *
 * @author juanjos
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner numero = new Scanner (System.in);
       
        int no1, no2;
        int n = 0;
        int i = 1;  
        
        System.out.println("Introduce tu primer numero");
        no1 = numero.nextInt();
        
        System.out.println("Introduce tu segundo numero");
        no2 = numero.nextInt();
        
        while (i <= no2){
            n+= no1;
            i++;
        }
        System.out.println("La multimiplacion entre "+no1+ " X " +no2+ " nos da: " +n);
    }
}
