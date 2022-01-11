package com.Assignment;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner( System .in );
        //Perimeter Of Parallelogram = 2(a+b) b -base , a - side
        int a,b,perimeter;
        System.out.print("Enter the Base value = ");
        a = input.nextInt();
        System.out.print( "Enter the side value = ");
        b = input.nextInt();

        perimeter = 2 *(a+b);

        System.out.println("Perimeter Of Parallelogram = "+perimeter);


    }
}
