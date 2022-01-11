package com.Assignment;
import java.util.*;
public class TotalSurfaceAreaOfCube<a> {

    //Total Surface Area Of Cube = 6  * a2

    public static void main(String [] args)
    {
        Scanner input  = new Scanner (System.in);

        double a , Cube ;

        System.out.print("Enter the value of a = ");
        a = input.nextDouble();

        Cube = 6 *a*a*a;

        System.out.println("Total Surface Area Of Cube  = " + Cube);


    }


}
