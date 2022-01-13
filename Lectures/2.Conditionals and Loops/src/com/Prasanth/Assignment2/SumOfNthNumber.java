package com.Prasanth.Assignment2;

import java.util.Scanner;

public class SumOfNthNumber {

    public static void main(String[] args) {
        System.out.print("Enter the range  = ");
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        int sum = 0 ;
        for (int i = 0; i < range; i++) {
            System.out.print("Enter value " + (i+1) + " = ");
            int value = input.nextInt();
            sum = sum + value;
        }
        System.out.println( "Sum  of value  = " + sum);
    }
}

