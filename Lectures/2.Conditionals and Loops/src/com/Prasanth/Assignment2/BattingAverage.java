package com.Prasanth.Assignment2;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        System.out.println("Batting Average");
        Scanner input  = new Scanner(System.in);
        System.out.println( "Enter the Runs = ");
        int runs = input.nextInt();
        System.out.print("Enter the no of matches Played = ");
        int matchs = input.nextInt();
        System.out.print("Enter the no of matches not out = ");
        int notout = input.nextInt();
        int temp = 0;
        int out = matchs - notout;
        if (out == 0)
        {
            temp = -1;
        }



        if ( temp == -1)
        {
            System.out.print( " NA ");
        }
        else
        {
            int battingaverage = runs/out;
            System.out.println( "Batting Average = "+battingaverage );
        }

    }
}

