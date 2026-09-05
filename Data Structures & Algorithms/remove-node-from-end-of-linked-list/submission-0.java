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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //  Find total nodes = n
        //         kth from last  = n-k+1 from start

        //     2 pointer curr, prev, while curr != null && i = 1; i++ counter!= n-k+1
        //             break loop
        //             prev.next = curr.next;

        // 1 2 3 

        int total = 0;
        ListNode curr = head, prev = head, next;

        while (curr != null){
            total++;
            curr = curr.next;
        }

        int i =1;
        curr = head;
        if (total-n ==0){
            return head.next;
        }
        while(curr!=null && i!=(total-n+1)){
            prev= curr;
            curr = curr.next;
            i++;
        }
        
        prev.next = curr.next;
        return head;
        
    }
}