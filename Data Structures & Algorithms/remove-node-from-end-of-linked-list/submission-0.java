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
        if(head==null || head.next==null) return null;
        int l = 0;
        ListNode counter = head;
        while(counter!=null) {
            l++;
            counter = counter.next;
        }
        l = l-n;
        if(l==0) return head.next;
        ListNode tracker = head;
        while(l>1) {
            tracker = tracker.next;
            l--;
        }
        tracker.next = tracker.next.next;
        return head;

    }
}
