package com.Prasanth;


import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
//
//    int ans = sum2();
//        System.out.println( " Sum = " + ans);
//
//    }
//    /*
//     access modifier


        static int sum2()
    {

        System.out.print("Enter the n1 value = ");
        Scanner input= new Scanner( System.in);
        int n1 = input .nextInt();
        System.out.print( "Enter the n2 value = ");
        int n2 = input.nextInt();
        int sum = n1 + n2;
       return  sum;
    }
    //Pass a Value of Numbers when you are calling the method in main()
    static  int sum3( int a , int b)

    {
       int sum = a+b;
       return sum;
    }
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
