package com.Prasanth.Assignment2;

import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {

        System.out.println( " Calculate Depreciation of Value ");
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter the Amount = ");
        double amount = input.nextDouble();
        System.out.print("Enter the No of Year = ");
        int year = input.nextInt();
        System.out.print("Enter the Deprecent = ");
        int deprecent = input.nextInt();
        double temp = amount;
        for (int i = 0; i < year; i++) {

            temp = ((100 - deprecent)*temp )/100;
        }
        System.out.println( "After Depreciation = " + temp);
    }
}
