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
        List<Integer> ls = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ls.add(temp.val);
            temp = temp.next;
        }
        int left = 0;
        int right = ls.size()-1;
        while(left<right){
            if(ls.get(left)!=ls.get(right)) return false;
            left++;  right--;
        }
        return true;
    }
}