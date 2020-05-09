package Leetcode;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day2_HappyNumber extends DefaultLeetcode{

    public Day2_HappyNumber(){
        completed = true;
        ID = 136;
        name = "Single Number";
        description = "Given a non-empty array of integers, \nevery element appears twice except for one. Find that single one.";
    }

    /*


     */
    public boolean isHappy(int n) {

        int result = n;
        Set<Integer> mySet = new HashSet<Integer>();
        while(result != 1){
            int temp = 0;
            int length = Integer.toString(result).length();
            for(int x = 0; x < length; x++){
                temp += (int)(Math.pow(result%10,2));
                result /= 10;
            }

            if(mySet.add(temp) == false){
                return false;
            }

            result = temp;
        }
        return true;

    }

    public void printArray(int[] arr){
        for(int x = 0; x < arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.println();
    }
}
