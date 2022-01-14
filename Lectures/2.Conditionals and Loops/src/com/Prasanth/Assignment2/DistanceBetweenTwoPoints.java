package com.Prasanth.Assignment2;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        System.out.println( "Distance Between Two Points ");
        // Distance Between Two Points formula = d=√((x_2-x_1)²+(y_2-y_1)²)

        int x1,x2,y1,y2;
        double answer = 0;
        Scanner input = new Scanner( System .in);

        System.out.print( "Enter the coordinates of x1 , y1 = ");
        x1 = input.nextInt();
        y1 = input.nextInt();

        System.out.println( "Enter the coordinates of x2 , y2 = ");
        x2 = input.nextInt();
        y2 = input.nextInt();

        answer = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println( " Distance Between Two Points are = "+ answer);

    }
}
