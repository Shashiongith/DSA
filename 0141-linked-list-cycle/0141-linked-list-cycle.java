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
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;

        while( fast != null && fast.next!=null ){

            slow = slow.next ;
            fast = fast.next.next;

            if(slow == fast ){
                cycle = true;
                slow = head;
                break;
            }
            
        }

        if(cycle){

            while(fast != null && fast.next != null){
                if(slow == fast) return true;
                slow = slow.next;
                fast = fast.next;
            }
        }

        return false;
    }
}