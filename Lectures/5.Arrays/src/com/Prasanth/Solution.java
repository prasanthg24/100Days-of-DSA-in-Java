package com.Prasanth;

class Solution
{

    public static void main(String[] args) {

        //boolean prasanth = checkIfPangram("prasanth");
        System.out.println( checkIfPangram("thequickbrownfoxjumpsoverthelazydog\""));
    }



    public static boolean checkIfPangram(String sentence)

    {


        for(char  c  = 'a' ; c <= 'z' ; c++)
        {
            if(!sentence.contains(String.valueOf(c)))
            {
                return false;
            }

        }
        return true;

    }
}