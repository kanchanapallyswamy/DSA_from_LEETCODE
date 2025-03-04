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
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode c=head;
        int car=0;
        while(c!=null){
            int s=c.val*2+car;
            c.val=s%10;
            car=s/10;
            c=c.next;
        }
        c=head;
        while(c.next!=null)c=c.next;
        if(car!=0)c.next=new ListNode(car);
        head=reverse(head);
        return head;
    }
    ListNode reverse(ListNode head){
        ListNode c=head,p=null,next=null;
        while(c!=null){
            next=c.next;
            c.next=p;
            p=c;
            c=next;
        }
        return p;
    }
}