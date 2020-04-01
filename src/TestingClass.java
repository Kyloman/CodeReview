import Sorting.*;

public class TestingClass {

    public TestingClass(){
        testAll();
    }

    public void testAll(){
        System.out.println("Testing Sorting Algorithms");
        testBubble();
        testSelection();
        testInsertion();

    }

    public void testBubble(){

        BubbleSort bubble = new BubbleSort(-25,25,50);
        bubble.printArray();
        bubble.sort();
        bubble.printArray();
        if(bubble.unitTest() == true){
            System.out.println("Bubble Sort tests passed.");
        }
    }

    public void testSelection(){

        SelectionSort select = new SelectionSort(-25,25,50);
        select.printArray();
        select.sort();
        select.printArray();
        if(select.unitTest() == true){
            System.out.println("Selection Sort tests passed.");
        }
    }

    public void testInsertion(){

        InsertionSort insert = new InsertionSort(-25,25,50);
        insert.printArray();
        insert.sort();
        insert.printArray();
        if(insert.unitTest() == true){
            System.out.println("Selection Sort tests passed.");
        }
    }

}

