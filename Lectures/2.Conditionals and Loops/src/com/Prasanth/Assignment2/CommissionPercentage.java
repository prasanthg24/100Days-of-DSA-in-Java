package com.Prasanth.Assignment2;
import java.util.Scanner;
public class CommissionPercentage {
    public static void main (String[] args)
    {
        Scanner input = new Scanner( System.in);
        //Commission Percentage = (commissionPercentage/100)*amount

        System.out.print("Enter the amount  = ") ;
        double amount  = input.nextInt();

        System.out.print( "Enter the commission percentage = ");
        double  commission = input.nextInt();

         double answer  = commission/100*amount;

        System.out.println(" Commission Percentage = " + answer);




    }
}

