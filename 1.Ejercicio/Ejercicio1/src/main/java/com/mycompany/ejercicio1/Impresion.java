/*
Ejercicio No.1

Implemente una clase donde permita visualizar el mayor y menor de tres números ingresados 
e implemente una función para cada caso

 */
package com.mycompany.ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Impresion {

    public static void main(String args[]) {
        Scanner numer = new Scanner(System.in);
        
        int a,b,c;
        int max,min;
        
        String name = "People";
        
        System.out.println("Hello "+ name + " please write only integer numbers with you want to show");   
        
        // se pide el 1 numero
        System.out.println("Please write the first number");
        a = numer.nextInt();
        
        // se pide el 2 numero
        System.out.println("Now write other number");
        b = numer.nextInt();
        
        // se pide el 3 numero
        System.out.println("Now to finish write the last number");
        c = numer.nextInt();
        
        if ((a > b) && (b > c)){
            System.out.println("the order from highest to lowest is: "  +a+" - "+ b + " - " +c);
            //JOptionPane.showMessageDialog(null, "the order from highest to lowest is: "  +a+" - "+ b + " - " +c);
        }
        else if ((a > c) && (c > b)){
            System.out.println("the order from highest to lowest is: "  +a+" - "+ c + " - " +b);
            //JOptionPane.showMessageDialog(null, "the order from highest to lowest is: "  +a+" - "+ c + " - " +b);
        }
        
        else if ((b > a) && (a > c)){
            System.out.println("the order from highest to lowest is: "  +b+" - "+ a + " - " +c);
            //JOptionPane.showMessageDialog(null, "the order from highest to lowest is: "  +b+" - "+ a + " - " +c);
        }
        else if ((b > c) && (c > a)){
            System.out.println("the order from highest to lowest is: "  +b+" - "+ a + " - " +c);
            //JOptionPane.showMessageDialog(null, "the order from highest to lowest is: "  +b+" - "+ c + " - " +a);
        }
        
        else if ((c > a) && (a > b)){
            System.out.println("the order from highest to lowest is: "  +c+" - "+ a + " - " +b);
            //JOptionPane.showMessageDialog(null, "the order from highest to lowest is: "  +c+" - "+ a + " - " +b);
        }
        else if ((c > b) && (b > a)){
            System.out.println("the order from highest to lowest is: "  +c+" - "+ b + " - " +a);
            //JOptionPane.showMessageDialog(null, "the order from highest to lowest is: "  +c+" - "+ b + " - " +a);
        }
        else{
            System.out.println("the order from highest to lowest is: "  +c+" - "+ b + " - " +a);
            //JOptionPane.showMessageDialog(null, "the order from highest to lowest is: "  +c+" - "+ b + " - " +a);
        }
    }
}

//Implemente una clase donde permita visualizar el mayor y menor de tres números ingresados 
