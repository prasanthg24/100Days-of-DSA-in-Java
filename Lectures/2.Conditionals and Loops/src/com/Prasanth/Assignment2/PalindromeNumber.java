package com.Prasanth.Assignment2;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println( "Palindrome Number or Not ");
        System.out.print( "Enter the number = ");
        Scanner input = new Scanner( System.in);
        int n = input.nextInt();
        int  temp = n,rem,sum = 0;
        while (n > 0)
        {
            rem = n % 10;
            sum = (sum * 10)+ rem;
            n = n/10;
        }

        if(temp == sum)
            System.out.println(sum + " is a Palindrome Number ");
        else
            System.out.println(sum + " is not a Palindrome Number ");
    }
}
