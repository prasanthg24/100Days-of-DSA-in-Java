package com.Assignment;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        //Volume Of Prism = base*height

        Scanner input  = new Scanner( System.in);
        double base,height,Volume;

        System.out.print("Enter the base value = ");
        base = input.nextDouble();
        System.out.print( "Enter the height value = ");
        height  = input.nextDouble();

        Volume = base * height;

        System.out.println( " Volume of Prism = " + Volume);




    }
}
