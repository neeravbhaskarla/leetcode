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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head, dummy = new ListNode(-1);
        dummy.next = head;
        while(n>0){
            p1 = p1.next;
            n--;
        }
        // For Edge case, where length of the list is same as n. then p1 becomes null.
        ListNode p2 = dummy;
        while(p1!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return dummy.next;
    }
