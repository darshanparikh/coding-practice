package com.solutions.leetcode.reversesinglylinkedlist;

/**
 * Solution for LeetCode Problem - Reverse Linked List
 * @see <a href="https://leetcode.com/problems/reverse-linked-list/">Problem Statement</a>
 * <a href="https://leetcode.com/submissions/detail/677899782/">Iterative Solution Performance</a>
 * <a href="https://leetcode.com/submissions/detail/678036337/">Recursive Solution Performance</a>
 * @author Darshan Parikh, darshan1191@gmail.com
 */
public class ReverseSinglyLinkedList {

    public static void main(String[] args) {
        printListNode(reverseListIteratively(
                new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4, null))))));

        printListNode(reverseListRecursively(
                new ListNode(11,
                new ListNode(12,
                new ListNode(13,
                new ListNode(14, null))))));
    }

    public static void printListNode(ListNode node){
        System.out.print("[ ");
        while(node != null) {
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.print("]");
    }

    public static ListNode reverseListIteratively(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode previousHead;
        ListNode newHead = null;
        do{
            previousHead = head;
            head = head.next;
            newHead = new ListNode(previousHead.val, newHead);
        } while(head != null);

        return newHead;
    }

    public static ListNode reverseListRecursively(ListNode head) {
        return reverseList(head, null);
    }

    private static ListNode reverseList(ListNode head, ListNode newHead) {
        if(head == null) {
            return newHead;
        }

        ListNode previousHead = head;
        head = head.next;
        newHead = new ListNode(previousHead.val, newHead);
        return reverseList(head, newHead);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
