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
    public ListNode middleNode(ListNode head) {
        if(head.next==null)return head;
        
        ListNode slow=head;
        ListNode fast=head;
        fast = fast.next;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }
        return slow.next;
    }
}