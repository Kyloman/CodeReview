package Leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

/*
I did this completely wrong, like absolutely and totally wrong. But I learned a lot from failing.
1. Read the question carefully and study the example thoroughly
2. Sorting is great to find patterns but not neccesary
3. IndexOf OP, returns starting index of chars in a String

    String myStr = "Hello planet earth, you are a great planet.";
    System.out.println(myStr.indexOf("planet"));

    results in 6




 */

public class L14_LongestPrefix extends DefaultLeetcode{

    public L14_LongestPrefix(){
        completed = true;
        ID = 13;
        name = "Roman To Integer";
        description = "Given a roman numeral, convert it to an integer. \nInput is guaranteed to be within the range from 1 to 3999.";
    }

    public String trueLongestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";

        String prefix = strs[0];

        for(int x = 1; x < strs.length && prefix != ""; x++){

            if(strs[x].length() < prefix.length())
                prefix = prefix.substring(0,strs[x].length());

            boolean noChange = false;
            while(!noChange){
                noChange = true;

                int len = prefix.length();

                if(!prefix.substring(0,len).equals(strs[x].substring(0,len))){
                        prefix = prefix.substring(0,len -1);
                        noChange = false;
                }
            }
        }


        return prefix;

    }

    public String longestCommonPrefix(String[] strs) {

        List<String> whatsLeft = new LinkedList<String>();

        for (int x = 0; x < strs.length; x++) {
            whatsLeft.add(strs[x]);
        }

        return  (findPrefix(whatsLeft, 0));

        }

        //idk whats happening osrry
        private String findPrefix(List<String> whatsLeft,int index){

            String myPrefix = whatsLeft.get(0).substring(0,index);

            if(whatsLeft.size() != 1){
                List<String> noMatch = new LinkedList<String>();

                for(int x = 1; x < whatsLeft.size(); x++){
                    //check for size issues
                    if(!(whatsLeft.get(0).length() >= index + 1) ||
                            !(whatsLeft.get(x).length() >= index + 1) ){

                        noMatch.add(whatsLeft.get(x));
                        whatsLeft.remove(x);
                        x -=1 ;
                    }
                    //check for match
                    else if(!whatsLeft.get(0).substring(0,index+1).equals(whatsLeft.get(x).substring(0,index+1))){
                        noMatch.add(whatsLeft.get(x));
                        whatsLeft.remove(x);
                        x -=1 ;
                    }
                }
                String left;
                if(whatsLeft.size() == 1) {
                    left = findPrefix(whatsLeft,index);
                }
                else{
                    left = findPrefix(whatsLeft,index+1);
                }

                String right;
                if(noMatch.size() > 0){
                    right = findPrefix(noMatch,index);
                }
                else{
                    right = "";
                }

                if(left.length() > right.length() ){
                    myPrefix = left;
                }
                else{
                    myPrefix = right;
                }
            }
            else{
                if(whatsLeft.get(0) != ""){
                    myPrefix = whatsLeft.get(0).substring(0,index);
                }
            }
            return myPrefix;
        }


    public void printArray(String[] arr){
        for(int x = 0; x < arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.println();
    }

}
