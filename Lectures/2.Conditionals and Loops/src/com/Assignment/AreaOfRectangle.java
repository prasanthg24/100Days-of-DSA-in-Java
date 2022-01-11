package com.Assignment;

import java.util.Scanner;

public class AreaOfRectangle
{
    /*
    A=wl  l	- Length	 ,  w - Width
    */
    public static void main(String[] args) {

        Scanner input  = new Scanner( System.in);
        System.out.print( " Enter the length  value = ");
        int length = input.nextInt();
        System.out.print(" Enter the Breadth value = ");
        int breadth = input.nextInt();

        double Area = length * breadth;
        System.out.println(" Area of Rectangle  =  "+ Area);


    }

}
