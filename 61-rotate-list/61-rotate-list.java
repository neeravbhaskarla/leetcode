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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode old_tail  = head;
        int n;
        for(n = 1; old_tail.next!=null; n++) old_tail = old_tail.next;
        old_tail.next = head;
        
        ListNode new_tail = head;
        
        for(int i=0; i<n-k%n-1; i++) new_tail = new_tail.next;
        
        ListNode new_head = new_tail.next;
        new_tail.next = null;
        return new_head;
    }
}