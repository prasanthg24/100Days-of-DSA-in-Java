package com.Prasanth.Assignment2;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        System.out.println( "Future Investment Value");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Present Value = ");
        int present = input.nextInt();
        System.out.print("Enter the Interest Rate = ");
        int interest = input.nextInt();
        System.out.print("Enter the Time Period in Years = ");
        int year = input.nextInt();

        double future = present * Math.pow( (1 + interest),year);
        System.out.println( " Future Investment Value = "+ future);
    }
}
