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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode start = head, end = head;
        ListNode startPrev = null, endNext = null;

        int i = 1;
        while (i < right) {
            if (i < left) {
                startPrev = start;
                start = start.next;
            }

            if (i < right) {
                end = end.next;
            }

            i++;
        }
        
        endNext = end.next;
        end.next = null;

        ListNode reversedHead = reverse(start, end);

        if (startPrev == null) {
            head = reversedHead;
        } 
        else { 
            startPrev.next = reversedHead;
        }

        start.next = endNext;

        return head;
    }

    private ListNode reverse(ListNode start, ListNode end) {
        ListNode curr = start, prev = null;
        while (curr != null) {
            ListNode nextTmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTmp;
        }
        return prev;
    }
}