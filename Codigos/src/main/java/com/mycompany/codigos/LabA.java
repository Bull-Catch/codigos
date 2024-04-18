package com.mycompany.codigos;

import java.util.Scanner;

public class LabA {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        int total = 0;
        for (int i = 0; i < n; i = i + 1) {
            int n1 = lector.nextInt();
            int n2 = lector.nextInt();
            int n3 = lector.nextInt();

            if (n1 + n2 + n3 >= 2) {
                total = total + 1;
            }
        }

        System.out.println(total);
    }
}
