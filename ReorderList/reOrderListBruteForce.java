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
    public ListNode getByIndex(ListNode iter, int index){
        while(index!=0){
            iter = iter.next;
            index--;
        }
        return iter;
    }
    public ListNode getLast(ListNode iter){
        while(iter.next!=null){
            iter = iter.next;
        }
        return iter;
    }
    public void reorderList(ListNode head) {
        ListNode front = head;
        ListNode back = getLast(head);
        ListNode iter = head;
        int len = 0;
        while(iter!=null){
            iter = iter.next;
            len++;
        }
        int numOfOperations = len/2;
        while(numOfOperations!=0){
            ListNode temp = front.next;
            front.next = back;
            back.next = temp;
            front = temp;
            back = getByIndex(head, len-1);
            numOfOperations--;
        }
        ListNode lastElem = getByIndex(head, len-1);
        lastElem.next = null;
    }
