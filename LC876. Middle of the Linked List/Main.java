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
    public int siz(ListNode head){
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
    public ListNode middleNode(ListNode head) {
        
        int size = siz(head) ;
        if(size % 2 != 0){    //odd
            int var=size/2;
            for(int i = 0 ;i<var;i++){
                head = head.next;
            }
            
        }
        else{
            int var=size/2;
            for(int i = 0 ;i<var;i++){
                head = head.next;
            }
            // head = head.next;
        }
        return head;
    }
}