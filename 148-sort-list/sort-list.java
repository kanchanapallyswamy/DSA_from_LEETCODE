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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }
    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev != null) prev.next = null;
        return slow;
    }
     public ListNode merge(ListNode l1, ListNode l2) {
    if(l1==null)return l2;
    if(l2==null)return l1;
    if(l1.val<=l2.val){
        l1.next=merge(l1.next,l2);
        return l1;
    }
    else {
        l2.next=merge(l1,l2.next);
        return l2;
    }
        
    }
}