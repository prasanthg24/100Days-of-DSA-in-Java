package com.Prasanth.Assignment2;

import java.util.Scanner;

public class GoOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Date Below 30 = ");
//        int day = input.nextInt();
            int count = 0;
        for (int i = 1; i <=31 ; i++) {

            if(  i % 2 == 0)
            {
                count ++;
            }
        }

        System.out.println( "Day out in Auguest is " + count);
    }
}
