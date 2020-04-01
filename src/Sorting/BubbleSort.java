package Sorting;
/*
    Sorting.BubbleSort
    File to test the Sorting.BubbleSort method.
    Contains an integer array and methods to repopulate and sort the array via Bubble Sort.
*/
public class BubbleSort extends DefaultSort{

    //Default constructor populates array with a default size and random values in a default bound
    public BubbleSort(){
        super();
    }

    //Overloaded constructor populates array with a default size and random values in a given bound
    public BubbleSort(int min, int max){
        super(min, max);
    }

    //Overloaded constructor populates array with a given size and random values in a given bound
    public BubbleSort(int min, int max, int size){
        super(min, max, size);
    }

    //Sorts an array using Bubble Sort
    public void sort(){
        boolean swapped = true;

        while(swapped == true){
            swapped = false;

            for(int x = 0; x < arr.length - 1; x++){
                if(arr[x] > arr[x+1]){
                    int temp = arr[x+1];
                    arr[x+1] = arr[x];
                    arr[x] = temp;
                    swapped = true;
                }
            }

        }
    }

}
