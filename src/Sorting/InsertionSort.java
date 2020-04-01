package Sorting;
/*
    Sorting.BubbleSort
    File to test the Sorting.BubbleSort method.
    Contains an integer array and methods to repopulate and sort the array via Selection Sort.
*/
public class InsertionSort extends  DefaultSort {

    //Default constructor populates array with a default size and random values in a default bound
    public InsertionSort() {
        super();
    }

    //Overloaded constructor populates array with a default size and random values in a given bound
    public InsertionSort(int min, int max) {
        super(min, max);
    }

    //Overloaded constructor populates array with a given size and random values in a given bound
    public InsertionSort(int min, int max, int size) {
        super(min, max, size);
    }

    //Sorts an array using Insertion Sort
    public void sort() {
        for(int x = 1; x < arr.length; x++){
            int currentIndex = x;
            while(((currentIndex >= 1) && (arr[currentIndex] <= arr[currentIndex - 1]))){
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex - 1];
                arr[currentIndex - 1] = temp;
                currentIndex -= 1;
            }
        }
    }
}

