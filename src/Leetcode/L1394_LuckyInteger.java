package Leetcode;

/*


 */

import java.util.HashMap;
import java.util.Map;

public class L1394_LuckyInteger extends DefaultLeetcode{

    public L1394_LuckyInteger(){
        completed = true;
        ID = 206;
        name = "Reverse Linked List";
        description = "Reverse a singly linked list.";
    }

    public int findLucky(int[] arr) {

        Map<Integer, Integer> nums = new HashMap<Integer, Integer>();

        int lucky = -1;

        for(int x = 0; x < arr.length; x++){
            if(nums.containsKey(arr[x])){
                nums.replace(arr[x], nums.get(arr[x]) + 1);
            }
            else{
                nums.put(arr[x], 1);
            }
        }

        //iterate over map
        for(Integer key : nums.keySet()){
            if(key == nums.get(key) && key > lucky){
                lucky = key;
            }
        }

        return lucky;
    }
}
