package com.Prasanth.Assignment2;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        System.out.print( " Enter the product Price = ");
        Scanner input = new Scanner( System.in);
        int price = input.nextInt();
        System.out.print("Enter the Discount Price = ");
        int discount  = input.nextInt();

        double  discountPrice = price /100 * discount;

        System.out.println( "Discount Price of the Product = " + discountPrice);

        System.out.println( "Price of Product After Discount  = " +(price -discountPrice));

    }
}
