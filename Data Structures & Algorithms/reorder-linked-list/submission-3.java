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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode counter = head;
        int l = 0;
        while(counter!=null) {
            l++;
            counter = counter.next;
        }
        if(l==2) return;
        int h = l/2;
        ListNode left = head;
        ListNode right = head;
        while(h>1) {
            right = right.next;
            h--;
        }
        right.next = reverse(right.next);
        if(l==3) return;
        ListNode temp;
        while(left!=null && left.next!=null && left.next!=right) {
            temp = left.next;
            left.next = right.next;
            right.next = right.next.next;
            left.next.next = temp;
            left = left.next.next;
        }
        left.next = right.next;
        temp = right.next.next;
        right.next.next = right;
        right.next = temp;

    }

    public ListNode reverse(ListNode root) {
        if(root==null || root.next==null) return root;
        ListNode temp = reverse(root.next);
        root.next.next = root;
        root.next = null;
        return temp;
    }
}
