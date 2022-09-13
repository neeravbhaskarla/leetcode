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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode();
        ListNode temp = result;
        
        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val + carry;
            carry = sum/10;
            int value = sum%10;
            temp.next = new ListNode(value);
            
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            int value = l1.val + carry;
            carry = value/10;
            temp.next = new ListNode(value%10);
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2!=null){
            int value = l2.val + carry;
            carry = value/10;
            temp.next = new ListNode(value%10);
            temp = temp.next;
            l2 = l2.next;
        }
        if(carry>0){
            temp.next = new ListNode(carry);
}
        return result.next;
    }
}