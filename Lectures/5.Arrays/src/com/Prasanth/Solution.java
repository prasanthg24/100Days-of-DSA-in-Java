package com.Prasanth;
import java.util.*;
class Solution
{

    public static void main(String[] args) {


       int [] num ={1,2,0,0};
        int k = 34;
        addToArrayForm(num,k);

    }



        public static void addToArrayForm(int[] nums, int k) {

            List<Integer> list=new ArrayList<>();

            int i=nums.length-1;

            while(i>=0 || k>0)
            {
                if(i>=0)
                    k=k+nums[i];

                list.add(k%10);

                k/=10;
                i--;
            }



            System.out.println( list);
            Collections.reverse(list);
            System.out.println( list);

        }

}