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
        List<Integer> vals = new ArrayList<>();
        
        ListNode currentNode = head;
        while(currentNode!=null){
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }
        
        List<Integer> reversedVals = new ArrayList<>();
        for(int i = vals.size() - 1; i>=0; i--){
            reversedVals.add(vals.get(i));
        }
        
        for(int i=0; i<vals.size(); i++){
            if(vals.get(i) != reversedVals.get(i))
                return false;
        }
        return true;
    }
}