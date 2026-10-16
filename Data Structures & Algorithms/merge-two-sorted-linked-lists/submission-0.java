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
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode first;
        ListNode second;
        ListNode res;
        if(list1.val<=list2.val){
            first = list1;
            second = list2;
        } else {
            first = list2;
            second = list1;
        }
        res = first;
        while(first!=null && second!=null && first.next!=null) {
            if(first.val<=second.val && first.next.val>=second.val) {
                ListNode temp1 = first.next;
                first.next = second;
                ListNode temp2 = second.next;
                second.next = temp1;
                second = temp2;
            } 
            first = first.next;
        }
        if(first.next==null) {
            first.next = second;
        } 
        return res;
    }
}