package Sorting;
import java.util.Random;
/*
    DefaultSort contains the blanket methods use to intialize, populate, test, and print arrays.

*/
public class DefaultSort {
    protected int[] arr;

    protected static final int DEFAULT_SIZE = 100;
    protected static final int MIN_NUM = -1000;
    protected static final int MAX_NUM = 1000;

    //Default constructor populates array with a default size and random values in a default bound
    public DefaultSort(){
        arr = new int[DEFAULT_SIZE];
        populateArray(MIN_NUM, MAX_NUM);
    }

    //Overloaded constructor populates array with a default size and random values in a given bound
    public DefaultSort(int min, int max){
        arr = new int[DEFAULT_SIZE];
        populateArray(min, max);
    }

    //Overloaded constructor populates array with a given size and random values in a given bound
    public DefaultSort(int min, int max, int size){
        if(size > 0) {
            arr = new int[size];
            populateArray(min, max);
        }
        else{
            throw new IllegalArgumentException("Empty array not allowed");
        }
    }


    //Populates in array with random values between min/max (both inclusive)
    public void populateArray(int min, int max){

        for(int x = 0; x < arr.length; x++){
            arr[x] = randomInt(min,max);
        }
    }

    //Prints out the array in the console
    public void printArray(){
        for(int x = 0; x < arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.println();
    }

    //Generates a random integer in the range min/max (both inclusive)
    protected int randomInt(int min, int max) {
        if (min < max) {
            Random rand = new Random();
            return rand.nextInt((max - min) + 1) + min;
        }
        else{
            throw new IllegalArgumentException("[randomInt] max <= min");
        }
    }

    //Tests whether the array is sorted correctly using neighboring numbers/random values test
    //Return true if tests passed/false otherwise
    public boolean unitTest(){

        //neighboring numbers test
        for(int x = 0; x < arr.length - 1; x++){
            if(arr[x] > arr[x+1]){
                System.err.println("Sorting Error: Number to the right lower than number to the left");
                return false;
            }
        }

        //100 random values size comparison test
        for(int x = 0; x < 100; x++){
            int index1 = randomInt(0, arr.length - 1);
            int index2 = randomInt(0, arr.length - 1);

            if((index1 <= index2) != (arr[index1] <= arr[index2]) && arr[index1] != arr[index2]){
                System.err.println("Sorting Error: Value in array not in correct place");
                System.err.println("Index 1: " + index1 + " Index2 2: " + index2 + " Value 1: " + arr[index1] + " Value 2: " + arr[index2]);
                return false;
            }
        }

        //check if no numbers are introduced/removed/replaced
        return true;
    }

    public void sort(){
        System.out.println("Error occurred");
    }

    public String getName(){
        return "Default Sort";
    }

}
