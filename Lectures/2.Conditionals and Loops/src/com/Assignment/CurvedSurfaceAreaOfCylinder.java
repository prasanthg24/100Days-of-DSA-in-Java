package com.Assignment;

import java.util.Scanner;
public class CurvedSurfaceAreaOfCylinder {

    public static void main(String [] args)
    {
        Scanner input   = new Scanner (System.in);
        // Curved Surface Area Of Cylinder  formula =  2πrh

        System.out.print("Enter the Radius value  = ");
        double radius , height ;
        radius = input.nextDouble();

        System.out.print("Enter the Height value = ");
        height = input.nextDouble();

        double volume = 2*Math.PI*radius*height;

        System.out.print("Volume of Curved Surface Area Of Cylinder  = "+ volume);




    }
}

