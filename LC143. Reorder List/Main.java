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
    
    public ListNode middle(ListNode head){

    if(head == null){
        return null ;
    }
    ListNode f = head;
    ListNode s = head;
    while(f.next != null && f.next.next != null){
        s = s.next;
        f = f.next.next;
    }
        return s;
    }
    
    public ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }
        
    ListNode prev = null;
    ListNode curr = head;
    
    while(curr != null){
        
        ListNode frwd =curr.next;
        curr.next = prev;
        
        prev = curr;
        curr = frwd;
    }
    return prev;
}

    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null){
            return;
        }
        //step 1
    
        ListNode mid = middle(head);
        ListNode nh = mid.next;
        mid.next = null;
        
        // step 2
        
        nh = reverse(nh);
        
        // step 3 
            ListNode c1 = head;
            ListNode c2 = nh;
            
        
        while (c1 != null && c2!= null){
            
            ListNode s1 = c1.next;
            ListNode s2 = c2.next;
            
            c1.next = c2;
            c2.next = s1;
            
            c1 = s1;
            c2 = s2;
            
           
            
        }
        
        
    
}
}