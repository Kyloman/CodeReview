package Leetcode;

/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

Example 2:

Input: nums = [6,5,4,8]
Output: [2,1,0,3]


 */

import java.util.HashMap;
import java.util.Map;

public class L1365_SmallerNumbers extends DefaultLeetcode{

    public L1365_SmallerNumbers(){
        completed = true;
        ID = 1365;
        name = "How Many Numbers Are Smaller Than the Current Number";
        description = "Given the array nums, for each nums[i] find \n out how many numbers in the array are smaller than it. \n That is, for each nums[i] you have to count the \n number of valid j's such that j != i and nums[j] < nums[i].";
    }

    /*
        My solution is O(nlogn).
        Clone the array and sort it using quicksort
        Create a map and put in all numbers in order
        Go up the map and populate the return array
        Return array
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] returnArray = new int[nums.length];

        //copy the array
        for(int x = 0; x < nums.length; x++)
            returnArray[x] = nums[x];

        //sort array with quicksort
        quickSort(returnArray, 0, returnArray.length-1);

        //Int x is a running count of how many numbers are behind current value
        //As soon as we see a new value, we associate running count with that number
        //This prevents counting duplicate numbers
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int x = 0; x < returnArray.length; x++) {
            if(!map.containsKey(returnArray[x])){
                map.put(returnArray[x], x);
            }
        }

        //populate return array
        for(int x = 0; x < nums.length; x++){
            if(map.containsKey(nums[x])) {
                returnArray[x] = map.get(nums[x]);
            }
            else{
                System.err.println("Map error");
            }
        }

        return returnArray;
    }

    //Quicksort method for array
    private void quickSort(int[] arr, int low, int high){
        if (low < high)
        {
            int part = partition(arr, low, high);
            quickSort(arr, low, part - 1);
            quickSort(arr, part + 1, high);
        }
    }

    //Quicksort helper method
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int check = (low - 1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                check++;
                int temp = arr[check];
                arr[check] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[check + 1];
        arr[check + 1] = arr[high];
        arr[high] = temp;
        return check + 1;
    }

    //My first thought was this, but definitely can find better than O(n^2)
    //I used this to check my solution for my real method instead
    public boolean test(int[] input, int[] output){
        int[] checkerArray = new int[input.length];

        //For each element in the array, compare to all elements to see if smaller or not
        for(int x = 0; x < input.length; x++){
            int total = 0;
            for(int y = 0; y < input.length; y++){
                if(input[x] > input[y]){
                    total++;
                }
            }
            checkerArray[x] = total;
        }

        if(checkerArray.length != output.length)
            return false;
        for(int x = 0; x < checkerArray.length; x++){
            if(checkerArray[x] != output[x])
                return false;
        }

        return true;
    }
}
