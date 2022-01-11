package com.Assignment;

import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        // area of rhombus = d1 * d2 /2
        int d1 ,d2,Area;
        System.out.print("Enter the d1 value = ");
        d1 = input.nextInt();
        System.out.print("Enter the d2 value = ");
        d2 = input .nextInt();

        Area = d1*d2/2;
        System.out.println( "Area of rhombus = " + Area);


    }
}

