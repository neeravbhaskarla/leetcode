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
    public ListNode swapPairs(ListNode head) {
        int count = 1; 
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = null;
        while(head!=null && head.next!=null){
            if(count%2!=0){
                if(count==1) dummy.next = head.next;
                ListNode nextNode = head.next;
                head.next = nextNode.next;
                nextNode.next = head;  
                if(prev!=null) prev.next = nextNode;
                prev = nextNode;
            }
            else{
                prev = head;
                head = head.next;
            } 
            count++;
        }
        return dummy.next;
    }
}