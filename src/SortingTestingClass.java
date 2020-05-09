import Sorting.*;

public class SortingTestingClass {

    private static int NUM_ALGORITHMS = 3;

    public SortingTestingClass(){
        testAll();
    }

    public void testAll(){
        System.out.println("Testing Sorting Algorithms");
        testSortingAlgs();

    }

    public void testSortingAlgs(){
        DefaultSort[] sorters = new DefaultSort[NUM_ALGORITHMS];

        BubbleSort bubble = new BubbleSort(-25,25,50);
        sorters[0] = bubble;
        sorters[1] = new SelectionSort(-25,25,50);
        sorters[2] = new InsertionSort(-25,25,50);

        for(DefaultSort testSort : sorters){
            testSort.printArray();
            testSort.sort();
            testSort.printArray();
            if(testSort.unitTest() == true){
                System.out.println(testSort.getName() + " tests passed");
            }

        }





    }


}

