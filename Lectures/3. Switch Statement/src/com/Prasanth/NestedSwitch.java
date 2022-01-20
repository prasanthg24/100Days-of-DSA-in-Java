package com.Prasanth;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch (empID)
        {
            case 1 :
                System.out.println( " Prasanth Gopinathan");
                break;
            case  2 :
                System.out.println(" Gowtham  R");
                break;
            case 3 :
                switch (department)
                {
                    case "MCA":
                        System.out.println(" Department of MCA");
                        break;
                    case "MBA":
                        System.out.println("Department of MBA");
                        break;
                    default:
                        System.out.println( "no department Entered");
                }
                break;
            default:
                System.out.println("Enter correct EMP ID");
        }

    }
}
