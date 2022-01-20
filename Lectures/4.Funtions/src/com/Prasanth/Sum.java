package com.Prasanth;


import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

    sum();

    }
    /*
     access modifier
     */
    static void  sum()
    {
        System.out.print("Enter the n1 value = ");
        Scanner input= new Scanner( System.in);
        int n1 = input .nextInt();
        System.out.print( "Enter the n2 value = ");
        int n2 = input.nextInt();
        int sum = n1 + n2;
        System.out.println( " Sum = "+ sum);
    }
}
