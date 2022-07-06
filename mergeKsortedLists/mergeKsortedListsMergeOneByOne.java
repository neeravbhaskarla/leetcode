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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode h = head;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                h.next = l1;
                h = l1;
                l1 = l1.next;
            }
            else{
                h.next = l2;
                h = l2;
                l2 = l2.next;
            }
        }
        if(l1!=null){
            h.next = l1;
        }
        if(l2!=null){
            h.next = l2;
        }
        return head.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        ListNode head;
        head = mergeTwoLists(lists[0], lists[1]);
        for(int i=2; i<lists.length; i++){
            head = mergeTwoLists(head, lists[i]);
        }
        return head;
    }
