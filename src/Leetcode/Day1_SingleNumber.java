package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Day1_SingleNumber extends DefaultLeetcode{

    public Day1_SingleNumber(){
        completed = true;
        ID = 136;
        name = "Single Number";
        description = "Given a non-empty array of integers, \nevery element appears twice except for one. Find that single one.";
    }

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int x = 0; x < nums.length; x++){

            if(map.containsKey(nums[x])){
                map.put(nums[x], 2);
            }
            else {
                map.put(nums[x], 1);
            }
        }

        for(int x = 0; x < nums.length; x++){
            if(map.get(nums[x]) == 1)
                return nums[x];
        }

        return -1;

    }

    public void test(){
        //just practicing multidimensional arrays here, not efficient at all

        int[] arr1 = {1};
        int[] arr2 = {1,1,2,2,3,3,4,4,5};
        int[] arr3 = {1,2,3,4,5,4,3,2,1};

        int[][] arrays = {arr1,arr2,arr3};

        Day1_SingleNumber testing = new Day1_SingleNumber();

        boolean pass = true;

        for(int[] arr : arrays){
            if(testing.singleNumber(arr) == -1)
                pass = false;
        }






    }

}
