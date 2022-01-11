package com.Assignment;

import java.util.Scanner;

public class VolumeOfPyramid {

    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        //Volume Of Pyramid = lwh/3

        double length , width , height ;

        System.out.print( "Enter the length = ");
        length = input.nextDouble();
        System.out.print( "Enter the Width = ");
        width = input.nextDouble();
        System.out.print( "Enter the height = ");
        height = input .nextDouble();

        double volume  = length*width*height/3;

        System.out.println( "Volume of Pyramid = "+ volume);

    }
}
