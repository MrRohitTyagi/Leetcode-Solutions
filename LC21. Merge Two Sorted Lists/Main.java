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
}