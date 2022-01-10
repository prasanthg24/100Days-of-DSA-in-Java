package com.Prasanth;

import java.util.Scanner;

public class Loops
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Hello World " + i);
//
//        }
        //while loop
       /* int i = 1;
        while (i<=n)
        {
            System.out.println(i);
            i++;
        }*/

        //do while loop
        int i = 1;
        do
        {
            System.out.println(i);
            i++;
        }while (i>=5);

    }
}
