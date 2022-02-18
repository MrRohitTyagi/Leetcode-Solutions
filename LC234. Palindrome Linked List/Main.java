class Solution {
    public boolean isPalindrome(ListNode head) {
      ListNode first = head, second = head; 
      while(first!=null && first.next!=null){
            first=first.next.next;
            second = second.next; 
      }
        ListNode end = reverse(second);
        
      while(head!=null && end!=null){
          if(head.val!=end.val){
              return false;
          }
          head = head.next;
          end = end.next;
      }
        return true;
    }   
    
    public static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode next = current.next;
        current.next = null;
        while(true){
            if(next == null){
                break;
            }
            ListNode temp = next.next;
            next.next = current;
            current = next;
            next = temp;
        }
        return current; 
        }
}