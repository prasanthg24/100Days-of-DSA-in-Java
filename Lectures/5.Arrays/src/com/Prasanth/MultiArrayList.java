package com.Prasanth;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        ArrayList <ArrayList<Integer>> List = new ArrayList<>();

        //initialization
        for (int i = 0 ;i <3 ; i++)
        {
            List.add(new ArrayList<>());
        }

        Scanner input = new Scanner(System.in);
        //add element
        for (int i = 0 ;i <3 ;i++)
        {
            for (int j = 0; j < 3; j++) {
                List.get(i).add(input.nextInt());
            }
        }
    }
}
