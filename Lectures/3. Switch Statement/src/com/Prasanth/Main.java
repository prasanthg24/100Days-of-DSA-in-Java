package com.Prasanth;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();
//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case " Orange":
//                System.out.println(" Round Fruit");
//                break;
//            case "Grape":
//                System.out.println("A Green Fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//
//        }
        int day = input.nextInt();

        switch (day) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weeekend");
                break;

        }

    }
}