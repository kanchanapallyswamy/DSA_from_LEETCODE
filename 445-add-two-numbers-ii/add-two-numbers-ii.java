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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        l1=reverse(l1);
        l2=reverse(l2);
        int c=0;
        ListNode head=new ListNode(-2);
        ListNode temp=head;
        while(l1!=null || l2!=null || c!=0){
            int a= l1!=null ? l1.val : 0;
            int b= l2!=null ? l2.val : 0;
            int s=a+b+c;
            ListNode nn=new ListNode(s%10);
            c=s/10;
            temp.next=nn;
            temp=nn;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        head=reverse(head.next);
        return head;

    }
    ListNode reverse(ListNode head){
        ListNode c=head,prev=null,next=null;
        while(c!=null){
            next=c.next;
            c.next=prev;
            prev=c;
            c=next;
        }
        return prev;
    }
}


        