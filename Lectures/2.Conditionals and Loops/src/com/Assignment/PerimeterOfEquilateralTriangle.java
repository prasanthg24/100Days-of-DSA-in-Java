package com.Assignment;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  Perimeter Of Equilateral Triangle formula = 3 a
        System.out.print("Enter the side value = ");
        int a = input.nextInt();
        float Perimeter = 3 * a;
        System.out.println( "Perimeter Of Equilateral Triangle = "+ Perimeter);

    }
}
