package com.Assignment;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // AREA OF CIRCLE
        // Formula =πr2

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value = ");
        int n = input.nextInt();
        double Area = n*n*Math.PI;
        System.out.println("Area of Circle = " + Area);




    }
}
