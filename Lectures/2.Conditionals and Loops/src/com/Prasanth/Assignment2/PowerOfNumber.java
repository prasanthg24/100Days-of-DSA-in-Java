package com.Prasanth.Assignment2;

import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String [] args )
    {
        System.out.print("Enter the number = ");
        Scanner input  = new Scanner( System.in);
        int  n = input.nextInt();
        System.out.print( "Enter the power = ");
        int power = input.nextInt();

        int answer = 1;

        for (int  i = 1;  i <=power;  i++) {

            answer = answer * n;


        }
        System.out.println("Answer  = " +answer);
    }
}
