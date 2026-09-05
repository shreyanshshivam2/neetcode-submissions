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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode curr = null;

        // int n1 = getsize(l1);
        // for (int i =0;i < n;i++)
        ListNode res = new ListNode(-1), temp = null;
        int sum = 0, carry =0;
        ListNode dummy = res;
        // l1 = reverse(l1);
        // l2 = reverse(l2);
        ListNode curr1 = l1, curr2 = l2;
        while ((curr1 != null || curr2 != null)||carry !=0){
            sum = carry +(((curr1!=null)?curr1.val:0)+((curr2!=null)?curr2.val:0));
        
                carry = sum/10;
                sum = sum%10;
                
            res.next = new ListNode(sum);  
            res = res.next;
            if (curr1 != null)
            curr1 = curr1.next;
            if (curr2 != null)
            curr2 = curr2.next;
        }
        return dummy.next;
    }

}