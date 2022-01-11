package com.Assignment;

import java.util.Scanner;

public class AreaofIsosceles {
    public static void main(String[] args) {
        //Area of Isosceles Triangle = [ b/4√((4*a*a)-(b*b)) ]
        Scanner input = new Scanner( System.in);
        System.out.print("Enter the length of Same side = ");
        double a = input.nextDouble();
        System.out.print("Enter the Side 2 of Triangle = ");
        double b = input.nextDouble();

        double Area = b/4* Math.sqrt((4*a*a)- (b*b));

        System.out.println( "Area of Isosceles = "+ Area);
    }
}
