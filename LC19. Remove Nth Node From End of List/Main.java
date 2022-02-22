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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null || head ==null){
            return null;}
        
        ListNode s = head;
        ListNode f = head;
        
        for(int i = 0;i<n;i++){
            f = f.next;
        }
        if(f == null)
            return head.next;
        
        while(f.next != null){
            s = s.next;
            f = f.next;
        }
        s.next = s.next.next;
        return head;
    }
}