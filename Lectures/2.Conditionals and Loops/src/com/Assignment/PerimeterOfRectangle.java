package com.Assignment;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length , breadth ,Perimeter ;
        System.out.print("Enter the length value = ");
        length = input .nextInt() ;
        System.out.print( "Enter the breadth value  = ");
        breadth = input  .nextInt();

        Perimeter  = 2*(length+breadth);

        System.out.println("Perimeter Of Rectangle = "+Perimeter);

    }
}
