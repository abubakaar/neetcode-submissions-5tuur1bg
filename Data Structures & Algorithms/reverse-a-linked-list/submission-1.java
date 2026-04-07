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
    public ListNode reverseList(ListNode head) {
        
        ListNode previous = null;
        if(head == null)
            return null;
        return revLogic(head, previous);
    }

    public ListNode revLogic(ListNode head, ListNode previous){
        
        if(head.next == null){
            head.next = previous;
            return head;
        }
        else{
            ListNode r =  revLogic(head.next, head);
            head.next = previous;
            return r;
        }
    }
    
}
