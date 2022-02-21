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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode p =head;
        
        ListNode one = list1;
        ListNode two = list2;
        if( list1 == null || list2==null){
            if(list1==null){
                return list2;}
            else{return list1;}
        }
        
        while(one != null && two != null){
            if(one.val < two.val){
                p.next =one;
                p = p.next;
                one = one.next;
            }
            else{
                p.next = two;
                p = two;
                two = two.next;
            }
        }
        if(one!= null){
            p.next = one;
        }
        if(two!= null){
            p.next = two;
        }
        return head.next;
    }
    
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
                
        ListNode mid = middle(head);
        ListNode nh = mid.next;
        mid.next = null;
        
        head = sortList(head);
        nh = sortList(nh);    
        
        return mergeTwoLists(head,nh);
    }
}