package com.Assignment;

import java.util.Scanner;

public class AreaOfTriangle {
        /*Area of Triangle
        Area of Triangle = ½(b × h) where b is base and h is height.
         Formula = (Base * Height)/2;*/
        public static void main(String[] args)
        {

            Scanner input = new Scanner( System .in);

            System.out.print(" Enter the base value = ");
            int base = input.nextInt();
            System.out.print(" Enter the height value = ");
            int height = input.nextInt();

            double AreaofTriangle = (base*height)/2;
            System.out.println( "Area of Triangle = " + AreaofTriangle);
        }

}

