package com.Prasanth.Assignment2;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.print( "Enter the principle = ");
        int principle = input.nextInt();
        System.out.print("Enter the Rate =  ");
        double  rate= input.nextDouble();
        System.out.print("Enter  No of Years = ");
        int year =  input.nextInt();
        double compoundInterest = principle * Math.pow(1+(rate/100),year);

        System.out.println(" Compound Interest = "+ compoundInterest);
    }

}
