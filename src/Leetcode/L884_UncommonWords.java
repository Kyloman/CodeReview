package Leetcode;

/*


 */

import java.util.*;

public class L884_UncommonWords extends DefaultLeetcode{

    public L884_UncommonWords(){
        completed = true;
        ID = 884;
        name = "Reverse Linked List";
        description = "Reverse a singly linked list.";
    }

    //1. Separate with " " delimiter
    //2. Put into HashMap. Singly occurring keys get value 1, double get 2.
    //3. Run through HashMap and put unique values into a list
    //4. Create String array with size of list and populate
    //5. Return String array
    public String[] uncommonFromSentences(String A, String B) {
        String[] aList = A.split(" ");
        String[] bList = B.split(" ");

        if(aList.length == 0 && bList.length == 0){
            String[] empty = new String[0];
            return empty;

        }

        List<String> ret = new ArrayList<String>();
        Map<String, Integer> count = new HashMap<>();

        for(int x = 0; x < aList.length; x++){
            if(count.containsKey(aList[x])){
                count.replace(aList[x], 2);
            }
            else {
                count.put(aList[x], 1);
            }
        }

        for(int x = 0; x < bList.length; x++){
            if(count.containsKey(bList[x])){
                count.replace(bList[x], 2);
            }
            else {
                count.put(bList[x], 1);
            }
        }

        for(String str : count.keySet()){
            if(count.containsKey(str)){
                if(count.get(str) == 1)
                    ret.add(str);
            }
        }

        String[] returnArray = new String[ret.size()];

        for(int x = 0; x < ret.size(); x++){
            returnArray[x] = ret.get(x);
        }

        return returnArray;
    }
}
