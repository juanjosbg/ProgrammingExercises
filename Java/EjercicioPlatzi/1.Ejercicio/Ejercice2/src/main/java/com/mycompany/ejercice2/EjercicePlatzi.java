/*
    char c = ‘z’; conviertelo a int
    int i = 250; conviertelo a long y luego de long a short
    double d = 301.067; conviertelo a long
    int i = 100; súmale 5000.66 y conviertelo a float
    int i = 737; multiplícalo por 100 y conviertelo a byte
    double d = 298.638; divídelo entre 25 y conviertelo a long
 */
package com.mycompany.ejercice2;

/**
 *
 * @author juanjos
 */
public class EjercicePlatzi {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    char c='z';
    int C = c;
    System.out.println("La variable C es: " +c+ " y estaconvertid en int tiene un valor de: "+C);

    int i = 250;
    long I = i;
    System.out.println("La variable i es: " +i+ " y estaconvertida en a long tiene un valor de: "+I);

    short s=(short)I;
    System.out.println("La variable s es: " +I+ " y estaconvertida en long a short tiene un valor de: "+s);

    double d = 301.067;
    long D =(long)d;
    System.out.println("La variable d es: " +d+ " y conviertida a long tiene un valor de: "+D);

   int ii = 100;
   float sf = (float) (ii + 5000.66);
   System.out.println("La variable ii es: " +ii+ " y sumandole 5000.66 tiene un valor de: "+sf);

   int r = 737; 
   byte ri = (byte) (r * 2);
   System.out.println("La variable r es: " +r+ " y multiplícalo por 100 tiene un valor de: "+ri);
   
   double dd = 298.638;
   long Dd = (long) (dd/25);
   System.out.println("La variable dd es: " +r+ " divídelo entre 25 tiene un valor de: "+ri);

    }
}
