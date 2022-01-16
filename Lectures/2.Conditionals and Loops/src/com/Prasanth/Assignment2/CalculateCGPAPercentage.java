package com.Prasanth.Assignment2;

import java.util.Scanner;

public class CalculateCGPAPercentage {
    private static int tamil;

    public static void main(String[] args) {
        System.out.println(" Calculate CGPA Java Program ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Tamil Mark = ");
        double tamil = input.nextDouble();
        System.out.print("Enter the English Mark = ");
        double english = input.nextDouble();
        System.out.print("Enter the Maths  Mark = ");
        double maths = input.nextDouble();
        System.out.print("Enter the Science Mark  = " );
        double science = input.nextDouble();
        System.out.print("Enter the Social Mark = ");
        double social = input.nextDouble();
        
        double cgpa = (tamil+english+maths+science+social)/5.0;
        
        double cgpaPercentage = cgpa*9.5;
        System.out.println("CGPA Percentage - " + cgpaPercentage);
        System.out.println("CGPA = "+cgpa);
        
    }
}
