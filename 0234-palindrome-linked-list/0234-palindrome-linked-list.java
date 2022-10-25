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
    public boolean isPalindrome(ListNode head) {
        ListNode middle = getMiddle(head);
        ListNode reversedNode = revList(middle.next);
        
        ListNode p1 = head;
        ListNode p2 = reversedNode;
        
        boolean flag = true;
        while(p2!=null){
            if(p1.val != p2.val){
                flag = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        
        middle.next = revList(reversedNode);
        return flag;
    }
    public ListNode revList(ListNode node){
        ListNode prev = null;
        while(node!=null){
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
    public ListNode getMiddle(ListNode node){
        ListNode slow = node;
        ListNode fast = node;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}