package Leetcode;

/*


 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L167_TwoSumII extends DefaultLeetcode{

    public L167_TwoSumII(){
        completed = true;
        ID = 884;
        name = "Reverse Linked List";
        description = "Reverse a singly linked list.";
    }

    public int[] twoSum(int[] numbers, int target) {

        /*
        int startingIndex = numbers.length-1;

        /*
        for(int x = numbers.length - 1; x >= 0; x--){
            if(numbers[x] < target){
                startingIndex = x;
                continue;
            }
        }
        */
        int[] returnArray = new int[2];

        int currentIndex = numbers.length - 1;

        int x = 0;
        int y = 0;

        while(x < numbers.length) {
            int result = (numbers[x] + numbers[currentIndex - y]);

            if (result == target) {
                returnArray[0] = x+1;
                returnArray[1] = currentIndex-y+1;
                return returnArray;
            } else if (result > target || (currentIndex-x == 1)) {
                x = 0;
                y++;
            }
            else{
                x++;
            }

        }
        return null;
    }
}
