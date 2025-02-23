/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        List<Integer> l=new ArrayList<>();
        ListNode c=node;
        while(c!=null){
            l.add(c.val);
            c=c.next;
        }
        System.out.println(l);
        node.val=node.next.val;
        node.next=node.next.next;
    }
}