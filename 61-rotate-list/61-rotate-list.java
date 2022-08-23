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
        ListNode temp = head;
        int n = 1;
        while(temp.next!=null){
            temp = temp.next;
            n++;
        }
        temp.next = head;
        int iter = 0;
        while(iter<n-k%n-1){
            head = head.next;
            iter++;
        }
        ListNode result = head.next;
        head.next = null;
        return result;
    }
}