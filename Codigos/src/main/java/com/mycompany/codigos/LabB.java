
package com.mycompany.codigos;

import java.util.Scanner;

public class LabB {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        int base= lector.nextInt();
        
        
        while(base==-1){
            System.out.println(base);
           base =base+base;
        }
        
        
    }
}
