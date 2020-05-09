package Sorting;
/*
    Sorting.BubbleSort
    File to test the Sorting.BubbleSort method.
    Contains an integer array and methods to repopulate and sort the array via Selection Sort.
*/
public class SelectionSort extends  DefaultSort {

    //Default constructor populates array with a default size and random values in a default bound
    public SelectionSort() {
        super();
    }

    //Overloaded constructor populates array with a default size and random values in a given bound
    public SelectionSort(int min, int max) {
        super(min, max);
    }

    //Overloaded constructor populates array with a given size and random values in a given bound
    public SelectionSort(int min, int max, int size) {
        super(min, max, size);
    }

    //Sorts an array using Bubble Sort
    public void sort() {
        //int[] temp = new int[arr.length];

        for (int index = 0; index < arr.length - 1; index++) {
            int smallest = index;

            for (int x = index; x < arr.length; x++) {
                if (arr[x] < arr[smallest]) {
                    smallest = x;
                }
            }

            int temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    public String getName(){
        return "Selection Sort";
    }

}

