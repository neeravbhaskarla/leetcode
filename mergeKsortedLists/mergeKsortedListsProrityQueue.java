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
        Queue<ListNode> pq = new PriorityQueue<ListNode>((a,b)-> a.val - b.val);
        for(ListNode node: lists){
            if(node!=null){
                pq.add(node);
            }
        }
        
        ListNode head = new ListNode(0);
        ListNode point = head;
        while(!pq.isEmpty()){
            point.next = pq.poll();
            point = point.next;
            ListNode next = point.next;
            if(next!=null){
                pq.add(next);
            }
        }
        return head.next;
    }
