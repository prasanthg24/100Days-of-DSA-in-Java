package com.Assignment;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        //perimeter of circle formula  = 2 PI r

        float r;
        System.out.print("Enter the Radius = ");
        r = input.nextFloat();
        float perimeter = (float) (2*Math.PI*r);
        System.out.println("Perimeter of circle = "+ perimeter);
    }
}
