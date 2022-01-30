package com.Prasanth;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args)
    {
        // syntax

        ArrayList <Integer> List = new ArrayList<>(10);
//        List.add(56);
//        List.add(86);
//        List.add(66);
//        List.add(46);
//        List.add(16);
//        List.add(46);
      //  System.out.println(List);
        Scanner input = new Scanner(System.in);
        for (int in = 0; in < 5; in++)
        {

            List.add(input.nextInt());

        }

        //get item at any .index
        System.out.println( "Output = ");
        List.remove(2);
        for (int i = 0; i < List.size() ; i++) {
            System.out.println( List.get(i));

        }
    }
}
