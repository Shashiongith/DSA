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
    public int getDecimalValue(ListNode head) {
        
        if(head == null )return 0;
        int sum = 0;

        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;

        while ( curr != null ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode temp = prev ;
        int product = 1;

        while( temp != null ){
            sum += (product*temp.val);
            product *= 2;
            temp = temp.next;
        }

        return sum;
    }
}