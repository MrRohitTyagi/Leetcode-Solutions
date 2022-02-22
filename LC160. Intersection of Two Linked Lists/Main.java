/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public int size ( ListNode head){
        ListNode curr = head;
        int len = 0;
        while(curr!= null){
            curr = curr.next;
            len ++;
                    
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = size(headA);
        int lenB = size(headB);
        
        int ans =Math.abs(lenA-lenB);
        
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        
        if(lenA<lenB){
            for(int i = 0 ;i<ans;i++){
                nodeB=nodeB.next;
            }
        }
        else{
            for(int i = 0 ;i<ans;i++){
                nodeA=nodeA.next;
        }
    }
        
        
        while(nodeA!=nodeB){
            nodeA = nodeA.next;
            nodeB = nodeB.next;
            
            
        }
        return nodeA;
    }
        
        
        
}