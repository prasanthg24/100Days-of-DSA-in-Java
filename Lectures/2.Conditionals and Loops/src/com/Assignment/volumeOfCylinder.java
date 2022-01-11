package com.Assignment;

import java.util.Scanner;

public class volumeOfCylinder {
    public static void main(String[] args) {
        //volume of cylinder = V=πr2h
        Scanner input = new  Scanner (System.in );

        double r ,h ,volume;
        System.out.print( "Enter the radius value = ");
        r = input.nextDouble();
        System.out.print( "Enter the height value = ");
        h = input.nextDouble();

        volume = Math.PI * r*r *h;

        System.out.println( " Volume of Cylinder = " + volume);
    }
}
