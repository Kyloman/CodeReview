import Leetcode.L1365_SmallerNumbers;

public class Main {

    public static void main(String[] args) {
        //CURRENT CODE TESTING
        int[] nums = {8,1,2,2,3};

        L1365_SmallerNumbers L1365 = new L1365_SmallerNumbers();

        if(L1365.test(nums,L1365.smallerNumbersThanCurrent(nums)))
            System.out.println("Passed");



        //ACTUAL CODE
        /*
        welcomeUser();
        TestingClass test = new TestingClass();

        */
    }

    private static void welcomeUser(){
        System.out.println("Welcome to my code review.");
    }

}