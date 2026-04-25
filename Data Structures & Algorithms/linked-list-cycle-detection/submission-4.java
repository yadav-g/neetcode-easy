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
    public boolean hasCycle(ListNode head) {
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        while(fastPtr!=null && slowPtr!=null){
            if(fastPtr.next==null || fastPtr.next.next==null){
                return false;
            }
            if(slowPtr.next==null ){
                return false;
            }
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(fastPtr==slowPtr){
                return true;
            }
        }
        return false;
    }
}
