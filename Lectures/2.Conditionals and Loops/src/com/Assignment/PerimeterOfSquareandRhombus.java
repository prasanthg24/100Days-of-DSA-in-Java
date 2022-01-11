package com.Assignment;

import java.util.Scanner;

public class PerimeterOfSquareandRhombus {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a;
        //Perimeter Of Square = 4 * a;
        System.out.print("Enter the Side value of Square = ");
        a = input.nextInt();

        float perimeter = 4*a;

        System.out.println("Perimeter Of Square = " +perimeter);
    }
}
