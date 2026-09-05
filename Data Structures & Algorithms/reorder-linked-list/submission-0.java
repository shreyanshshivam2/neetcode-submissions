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
    public void reorderList(ListNode head) {

ListNode fast = head, slow =head, curr2 = null;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode mid = slow, head2 = slow.next;
        mid.next = null;
        ListNode prev=null, next, curr = head2;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }

        // new head = prev;
        // mid.next = prev;
        curr = head; curr2 = prev; 
        
        // ListNode res = head;
        while (curr2 != null){
          ListNode temp1 = curr.next;
          ListNode temp2  = curr2.next;

          curr.next = curr2;
          curr2.next = temp1;
          curr = temp1;
          curr2 = temp2;
        }
        
        return ;
    }
}