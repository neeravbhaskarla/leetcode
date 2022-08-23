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
    private ListNode reverseKthTime(ListNode head, int k){
        ListNode rev_head = null;
        ListNode ptr = head;
        while(k>0){
            ListNode next = ptr.next;
            ptr.next = rev_head;
            
            rev_head = ptr;
            ptr = next;
            k--;
        }
        return rev_head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode ptr = head;
        
        while(count<k && ptr!=null){
            ptr = ptr.next;
            count++;
        }
        
        if(count == k){
            ListNode reversed_head = reverseKthTime(head, k);
            
            head.next = reverseKGroup(ptr, k);
            
            return reversed_head;
        }
        
        return head;
    }
}