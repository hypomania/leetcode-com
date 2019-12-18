package Leetcode;

import Collection.ListNode;

public class L21 {
    public static void main(String[] args) {

        ListNode first = new ListNode(1);
        first.next = new ListNode(2);
        first.next.next = new ListNode(4);

        ListNode second = new ListNode(1);
        second.next = new ListNode(3);
        second.next.next = new ListNode(4);

        L21 l21 = new L21();
        System.out.println(l21.mergeTwoLists(first, second));

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode newNode = new ListNode(0);
        if ( l2!= null && (l1 == null || l2.val <= l1.val)) {
            newNode.val = l2.val;
            newNode.next = mergeTwoLists(l1, l2.next);

        } else if (l1!= null &&(l2 == null  || l1.val <= l2.val)) {
            newNode.val = l1.val;
            newNode.next = mergeTwoLists(l1.next, l2);
        }

        return newNode;
    }
}
