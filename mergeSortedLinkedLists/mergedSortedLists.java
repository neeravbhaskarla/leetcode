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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null) return l2;
        
        if(l2 == null) return l1;
        
        
        
        if(l1.val > l2.val) {
            ListNode tmp = l2;
            l2 = l1;
            l1 = tmp;
           // l1 = l1.next;
        }
        
        ListNode head = l1;
        ListNode prev = l1;
        l1 = l1.next;
        
        
        
        while(l1 != null && l2 != null) {
            
           if(l1.val <= l2.val) {
               prev = l1;
               l1 = l1.next;
           }
           else {
              ListNode curr = l2;
              l2 = l2.next;
              curr.next = l1;
              prev.next = curr;
              prev = prev.next;
           }
            
        }
        
        
        if(l1 == null) prev.next = l2;
        
        return head;
        
        
        
        
    }
