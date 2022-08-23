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
    
    public ListNode reverseLinkedList(ListNode node){
        ListNode prev = null;
        ListNode iter = node;
        
        while(iter!=null){
            ListNode next = iter.next;
            iter.next = prev;
            prev = iter;
            iter = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode p1 = head;
        ListNode p2 = reverseLinkedList(slow.next);
        
        while(p2!=null){
            if(p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}