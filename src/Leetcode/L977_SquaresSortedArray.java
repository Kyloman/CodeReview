package Leetcode;

/*


 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class L977_SquaresSortedArray extends DefaultLeetcode{

    public L977_SquaresSortedArray(){
        completed = true;
        ID = 206;
        name = "Reverse Linked List";
        description = "Reverse a singly linked list.";
    }

    public int[] sortedSquares(int[] A) {

        if(A.length == 0)
                return A;

        int[] arr = new int[A.length];

        int signChangeIndex = 0;

        while(A[signChangeIndex] < 0 && signChangeIndex < A.length){
            signChangeIndex ++;
        }

        //signChangeIndex now points to one of the following:
        //biggest negative number in all negative numbered array
        //first positive number in mixed sign array
        //smallest positive number in all positive array

        //in all cases, if there is nothing to the left, nothing to the right, we add
        //otherwise compare

        for(int x = 0; x < arr.length; x++){
            //only number to left or right or neither
            if(signChangeIndex == x || signChangeIndex == A.length - 1){
                arr[x] = (int)Math.pow((A[x]),2);
            }
            else{
                //there is a number to the left and right, we need to find smallest absolute value
                int min = Math.min(Math.abs(A[x-1]), Math.abs(A[x+1]));

                if(Math.min(min, Math.abs(x)) == min){

                }
                else{

                }

            }
        }



        return null;
    }

    //O(2n)
    public int[] sortedSquaresArraylist(int[] A) {

        if(A.length == 0)
            return A;

        int[] arr = new int[A.length];

        ArrayList<Integer> Alist = new ArrayList<>();

        for(int x = 0; x < A.length; x++){
            Alist.add((int)Math.pow(A[x],2));
        }

        int signChangeIndex = 0;

        while(A[signChangeIndex] < 0 && signChangeIndex < A.length){
            signChangeIndex++;
        }

        //this is O(n)
        //smartSort(Alist, arr, signChangeIndex);


        //signChangeIndex now points to one of the following:
        //biggest negative number in all negative numbered array
        //first positive number in mixed sign array
        //smallest positive number in all positive array

        //in all cases, if there is nothing to the left, nothing to the right, we add
        //otherwise compare

        int index = 0;
        while(Alist.size() != 0){
            //one number left
            if(Alist.size() == 1){
                arr[index] = (int)Math.pow(Alist.remove(0),2);

            }
            //left side of arrayList
            else if(signChangeIndex == 0){
                if(Math.abs(Alist.get(0)) < Math.abs(Alist.get(1))){
                    arr[index] = (int)Math.pow(Alist.remove(0),2);
                }
                else{
                    arr[index] = (int)Math.pow(Alist.remove(0),2);
                }
            }
            //right side of arraylist
            else if(signChangeIndex == Alist.size()-1){
                if(Math.abs(Alist.get(Alist.size() - 1)) < Math.abs(Alist.get(Alist.size() - 2))){
                    arr[index] = (int)Math.pow(Alist.remove(Alist.size() - 1),2);
                }
                else{
                    arr[index] = (int)Math.pow(Alist.remove(Alist.size() - 2),2);
                }
                //decrement pointer by 1
                signChangeIndex--;
            }
            else{
                if(Math.abs(Alist.get(signChangeIndex)) < Math.abs(Alist.get(signChangeIndex + 1))){
                    arr[index] = (int)Math.pow(Alist.remove(signChangeIndex),2);
                }

            }
            //middle of Arraylist between two numbers
            //put code here lol, too lazy to finish

            index++;
        }


        return null;

    }



}
