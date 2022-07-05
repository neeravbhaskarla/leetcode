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
    public void reorderList(ListNode head) {
        ListNode iter = head;
        while(iter!=null){
            iter.next = reverse(iter.next);
            iter = iter.next;
        }
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode tmp = head;
        while (tmp != null){
            ListNode next = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = next;
        }
        return prev;
    }
