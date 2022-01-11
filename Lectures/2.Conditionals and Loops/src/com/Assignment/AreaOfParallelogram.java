package com.Assignment;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {

        // Area of parallelogram= base x height
        System.out.print("Enter the Base value = ");
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        System.out.print("Enter the height value = ");
        int height = input.nextInt();

        int Area = base * height ;
        System.out.println( "Area of Parallelogram = "+ Area);
    }
}
