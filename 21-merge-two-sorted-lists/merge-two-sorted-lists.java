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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h1 = list1;
        ListNode h2 = list2;
        if(h1==null && h2==null)return null;
        else if(h2==null) return h1;
        else if(h1==null) return h2;
        ListNode h = new ListNode(Math.min(h1.val,h2.val));
        if(h1.val<h2.val)h1 = h1.next;
        else if(h1.val>h2.val) h2 = h2.next;
        else h1 = h1.next;
        ListNode curr = h;
        while(h1!=null && h2!=null){
            if(h1.val<=h2.val){
                curr.next = h1;
                h1 = h1.next;
            }
            else{
                curr.next = h2;
                h2 = h2.next;
            } 
            curr = curr.next;            
        }
        while(h1!=null){
            curr.next = h1;
            h1 = h1.next;
            curr = curr.next;
        }
        while(h2!=null){
            curr.next = h2;
            h2 = h2.next;
            curr = curr.next;
        }
        return h;
    }
}