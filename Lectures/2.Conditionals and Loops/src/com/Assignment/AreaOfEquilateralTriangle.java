package com.Assignment;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {

        //Area of an equilateral triangle = (√3/4) × a2
        System.out.print( " Enter the value to find equilateral triangle = ");
        Scanner input = new Scanner( System.in);
        double a = input.nextDouble();
        double Area = (Math.sqrt(3)*a*a)/4;
        System.out.println( " Area of an equilateral triangle = " + Area);

    }
}
