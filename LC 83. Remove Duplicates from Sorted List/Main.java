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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null){
            return head;
        }
        
        ListNode s = head;
        
        while(s.next != null){
            
            if(s.next.val == s.val){
                s.next = s.next.next;
            }
            else{
                s = s.next;
            }
        }
        return head;
    }
}