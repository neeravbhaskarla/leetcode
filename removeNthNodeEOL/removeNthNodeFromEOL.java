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
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        if(len<=1){
            return null;
        }
        ListNode iter = head, prev = null;
        len-=n;
        // If it is last element i.e if n is equal to length of linked list
        if(len == 0){
            return head.next;
        }
        while(len!=0){
            prev = iter;
            iter = iter.next;
            len--;
        }
        prev.next = iter.next;
        iter.next = null;   

        return head;
    }
