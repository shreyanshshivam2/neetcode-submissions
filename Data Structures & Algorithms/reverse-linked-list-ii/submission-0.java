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
        ListNode curr = null, prev_left = null, next_right = null, prev = curr, next = null, node_left = null,node_right =null;
        ListNode dummy =  new ListNode(-1);
        dummy.next = head;
        curr = dummy;
        int i =0;
        while(curr != null ){
            next = curr.next;
            if (i == left){
                prev_left = prev;
                node_left = curr;
            }

            if (i == right){
                next_right = next;
                node_right = curr;
            }
            prev = curr;
            curr = next;
            i++;
        }


        prev_left.next = null;
        node_right.next = null;

        curr = node_left;
        prev = null;
        next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =  next;
        }

        prev_left.next = prev;
        node_left.next = next_right;

        return dummy.next;
    }
}