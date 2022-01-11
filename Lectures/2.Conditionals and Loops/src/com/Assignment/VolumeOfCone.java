package com.Assignment;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        // volume of a cone is V=1/3hπr²

        System.out.print( "Enter the Radius = ");
        int r = input.nextInt();

        System.out.print("Enter the Height = ");
        int h = input.nextInt();

        double volume = h*Math.PI*(r*r)*1/3;

        System.out.println( "volume of a cone is = " + volume);






    }
}
