package com.Prasanth;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println( " Enter the value = ");
        int n = input.nextInt();
        int rem , reverse = 0;
        while (n>0)
        {
            rem =  n % 10;
            reverse =(reverse * 10)+rem;
            n = n /10;

        }
        System.out.println( "Reverse of number is  = "+ reverse );


    }
}

