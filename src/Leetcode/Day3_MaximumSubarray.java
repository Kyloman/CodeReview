package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Day3_MaximumSubarray extends DefaultLeetcode{

    public Day3_MaximumSubarray(){
        completed = true;
        ID = 528;
        name = "Maximum Subarray";
        description = "Given an integer array nums, find the contiguous subarray (containing \nat least one number) which has the largest sum and return its sum.";
    }

    public int maxSubArray(int[] nums) {
        int maxNum = nums[0];
        int runningSet = 0;
        for(int x = 0; x < nums.length; x++){
            //First we make sure that we return the highest max in an array if that's the answer
            if(nums[x] > maxNum){
                maxNum = nums[x];
            }

            //Now we need to accomodate for sets
            runningSet += nums[x];

            //If The running set is negative, we want to reset it because a negative set will only be equal or lower than
            //the current max num
            if(runningSet > 0){
                if(runningSet > maxNum){
                    //if the set is higher, then it is the new maximum number
                    maxNum = runningSet;
                }
            }
            else{
                runningSet = 0;
            }
        }

        return maxNum;
    }

    public void printArray(int[] arr){
        for(int x = 0; x < arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.println();
    }

}
