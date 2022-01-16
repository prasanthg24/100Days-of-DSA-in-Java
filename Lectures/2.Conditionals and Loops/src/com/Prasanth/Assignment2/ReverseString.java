package com.Prasanth.Assignment2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println( " Reverse String ");

        Scanner input = new Scanner( System.in);
        System.out.print("Enter the String = ");
        String n = input.nextLine();
        int i = n.length();
        System.out.print(" After Reverse = ");
        while ( i>0 )
        {
            System.out.print(n.charAt(i-1));
            i--;
        }

        



    }
}
