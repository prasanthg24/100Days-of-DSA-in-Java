package com.Prasanth.Assignment2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = input.nextInt();
        int rem ,temp ,sum ;
        temp = n;
        sum = 0;
        while ( n>0)
        {
            rem = n % 10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        if(temp == sum)
            System.out.println( temp + " is a Armstrong Number");
        else
            System.out.println(temp + " is a Not an Armstrong Number" );
    }
}
