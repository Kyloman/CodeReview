package Leetcode;

/*


 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L206_ReverseLinkedList extends DefaultLeetcode{

    public L206_ReverseLinkedList(){
        completed = true;
        ID = 206;
        name = "Reverse Linked List";
        description = "Reverse a singly linked list.";
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {


        return null;
    }

    /*
    The following methods are practice for linked lists
    It's been a while since I worked with them and nodes so I wanted to refresh my memory
     */
    public void linkedListPractice(){
        ListNode head = new ListNode(1);
        head.next = null;

        linkedListTest(head);
    }

    public ListNode linkedListTest(ListNode head){
        ListNode first = head;


        head.next = new ListNode(3);
        head = head.next;

        head.next = new ListNode(5);
        head = head.next;

        head = new ListNode(10);
        head.next = null;

        head = new ListNode(100);
        head.next = null;


        while(first != null){
            System.out.println(first.val);
            first = first.next;
        }

        return null;
    }



    //My first thought was this, but definitely can find better than O(n^2)
    //I used this to check my solution for my real method instead
    public boolean test(int[] input, int[] output){

        return false;
    }
}
