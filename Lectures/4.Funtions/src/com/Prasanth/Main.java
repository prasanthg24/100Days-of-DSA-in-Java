package com.Prasanth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Q1 .Take input of 2 numbers and print the sum

        Scanner input = new Scanner(System.in);

        System.out.print( "Enter the n1= ");
        int n1 = input.nextInt();
        System.out.print( "Enter the n2= ");
        int n2 = input.nextInt();
        int sum = n1 + n2 ;

        System.out.println( "Sum = " + sum );

    }
}
