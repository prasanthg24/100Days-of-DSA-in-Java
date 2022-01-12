package com.Prasanth.Assignment2;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
         Scanner input = new Scanner( System.in);
        System.out.print( "Enter the range = ");
        int n = input.nextInt();
        int value,sum = 0;
        double  averge;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the values = ");
            value  = input.nextInt();
            sum = sum +value;
        }
        averge = sum /n;
        System.out.println("Average = " + averge  );
    }
}

