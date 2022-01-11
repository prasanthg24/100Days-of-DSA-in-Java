package com.Assignment;

import java.util.Scanner;

public class VolumeOfSphere
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in);
        // V=4/3π*(r*r*r)
        double r,volume;
        System.out.print( "Enter the value of Radius = ");
        r = input.nextDouble();

        volume = Math.PI*(r*r*r)*4/3;

        System.out.println(" Volume Of Sphere = "+ volume);

    }
}
