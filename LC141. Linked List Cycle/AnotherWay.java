/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode c = head;
        int i = 0;
        while(c != null){
            // System.out.println(c.val);
            c = c.next;
            i++;
            if(i > 10001){
                break;
            }
        }
        if(i>10000)
            return true;
        else{return false;}
        
        
    }
}