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
        ListNode iter = head;
        int len = 0;
        while(iter!=null){
            iter = iter.next;
            len++;
        }
        
        int k = len - n;
        if(k==0){
            return head.next;
        }
        
        iter = head;
        while(k>1){
            iter = iter.next;
            k--;
        }
        iter.next = iter.next.next;
        return head;
    }
