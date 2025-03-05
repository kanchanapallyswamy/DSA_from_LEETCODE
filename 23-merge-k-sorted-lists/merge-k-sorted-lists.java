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
    public ListNode mergeKLists(ListNode[] l) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(var i:l){
        while(i!=null){
            pq.offer(i.val);
            i=i.next;
            }
        }
        ListNode head=insert(pq);
        return head;
    }
    ListNode insert(PriorityQueue<Integer> pq){
        if(pq.isEmpty())return null;
        ListNode head=new ListNode(pq.poll());
        ListNode c=head;
        while(!pq.isEmpty()){
            c.next=new ListNode(pq.poll());
            c=c.next;
        }
        return head;
    }
}