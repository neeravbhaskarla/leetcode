/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> hash = new ArrayList();
        ListNode iter = head;
        while(iter!=null){
            if(hash.contains(iter)) return true;
            hash.add(iter);
            iter = iter.next;
        }
        return false;
    }
