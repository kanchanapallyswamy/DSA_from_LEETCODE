class MyLinkedList {
    ListNode head;
    public MyLinkedList() {
        head=null;
    }
    
    public int get(int index) {
        if(index>=size())return -1;
        ListNode c=head;
        while(index-->0){
            c=c.next;
        }
        return c.val;
    }
    
    public void addAtHead(int val) {
        if(head==null){
            head=new ListNode(val);
        }
        else{
            ListNode dummy=head;
            head=null;
            head=new ListNode(val);
            head.next=dummy;
        }
    }
    
    public void addAtTail(int val) {
        if(head==null) head=new ListNode(val);
        else{
            ListNode dummy=head;
            while(dummy.next!=null){
                 dummy=dummy.next;
            }
            dummy.next=new ListNode(val);
    }
    }
    
    public void addAtIndex(int index, int val) {
        ListNode nn=new ListNode(val);
        if(index>size())return ;
        if(head==null){
            head=nn;
            return ;
        }
        if(index==0){
            nn.next=head;
            head=nn;
            return ;
        }
        ListNode c=head;
        while(index-->1){
            c=c.next;
        }
        ListNode rem=c.next;
        c.next=nn;
        nn.next=rem;
        return ;

    }
    
    public void deleteAtIndex(int index) {
        if(index>size())return ;
        if(head==null)return ;
        if(index==0){
            head=head.next;
            return ;
        }
        ListNode c=head;
        while(index-->1){
            c=c.next;
        }
        if(c.next!=null)c.next=c.next.next;
        return ;
    }
    public int size(){
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int v){
        val=v;
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */