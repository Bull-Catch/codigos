
package com.mycompany.codigos;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int base = lector.nextInt();
        switch (base) {
            case 2:
                System.out.println("Base: ");
                System.out.println("*");
                System.out.println("**");
                System.out.println("3");
                break;
            case 3:
                System.out.println("Base: ");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("6");
                break;
            case 4:
                System.out.println("Base: ");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("10");
                break;
            case 5:
                System.out.println("Base: ");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");
                System.out.println("15");
                break;

            default:
                System.out.println("Base: ");
                System.out.println("Ttriangulo no disponible");

        }
    }
}
