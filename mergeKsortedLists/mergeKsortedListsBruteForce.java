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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> mergedList = new ArrayList();
        for(ListNode list: lists){
            while(list!=null){
                mergedList.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(mergedList);
        ListNode head = new ListNode(-1);
        ListNode iter = head;
        for(int val: mergedList){
            iter.next = new ListNode(val);
            iter = iter.next;
        }
        iter.next = null;
        return head.next;
    }
