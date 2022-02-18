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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!= null){
            ListNode f = curr.next;
            curr.next = prev;
            prev = curr;
            curr = f;
            
            
            
        }
        return prev;
        
    }
}