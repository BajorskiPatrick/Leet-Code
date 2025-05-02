/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode result = new ListNode();
        ListNode head = result;
        while (list1 != null && list2 != null) {
            result.next = new ListNode();
            if (list1.val <= list2.val) {
                System.out.println("L1: " + list1.val);
                result.val = list1.val;
                list1 = list1.next;
            }
            else {
                System.out.println("L2: " + list2.val);
                result.val = list2.val;
                list2 = list2.next;
            }
            result = result.next;
        }
        int i = 0;
        while (list1 != null) {
            if (i==0) {
                i++;
            }
            else {
                result.next = new ListNode();
                result = result.next;
            }
            System.out.println("L1 then: " + list1.val);
            result.val = list1.val;
            list1 = list1.next;
        }
        while (list2 != null) {
            if (i==0) {
                i++;
            }
            else {
                result.next = new ListNode();
                result = result.next;
            }
            System.out.println("L2 then: " + list2.val);
            result.val = list2.val;
            list2 = list2.next;
        }

        return head;
    }
}