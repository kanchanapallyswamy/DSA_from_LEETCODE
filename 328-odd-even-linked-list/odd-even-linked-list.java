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
    public ListNode oddEvenList(ListNode head) {
        ListNode even=new ListNode(-99);
        ListNode odd=new ListNode(-9999);
        int c=0;
        if(head==null)return null;
        ListNode c1=head,c2=even,c3=odd;
        while(c1!=null){
            // ListNode nn=new ListNode(c1.val);
            if(c%2==0){
                    c3.next=new ListNode(c1.val);
                    c3=c3.next;
            }
            else{
                c2.next=new ListNode(c1.val);
                c2=c2.next;
            }
            c1=c1.next;
            c++;
        }
        odd=odd.next;
        even=even.next;
        c3=odd;
        while(c3.next!=null){
            c3=c3.next;
        }
        c3.next=even;
        return odd;
    
    }
}