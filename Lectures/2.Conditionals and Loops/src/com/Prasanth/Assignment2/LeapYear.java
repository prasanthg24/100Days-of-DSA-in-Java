package com.Prasanth.Assignment2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the value = ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if ((n%4 == 0) && (n%100 == 0)|| (n%400 ==0) )
        {
            System.out.println( " Leap Year");
        }
        else
        {
            System.out.println( " Not a Leap Year");
        }

    }
}
