class LRUCache {
    CDLLNode lst;
    int size;
    int capacity;
    Map<Integer,Node> mp;
    public LRUCache(int capacity) {
        this.size=0;
        this.capacity=capacity;
        lst=new CDLLNode();
        mp=new HashMap<>();
    }
    
    public int get(int key) {
        if(!mp.containsKey(key))return -1;
        Node nn=mp.get(key);
        lst.moveFront(nn);
        return nn.value;

    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            Node nn=mp.get(key);
            nn.value=value;
            lst.moveFront(nn);
        }
        else if(size<capacity){
                Node nn=lst.addAtHead(key,value);
                mp.put(key,nn);
                size++;
        }
        else{
            int k=lst.deleteAtLast();
            mp.remove(k);
            Node nn=lst.addAtHead(key,value);
            mp.put(key,nn);
        }
    }
}
class Node{
    int key,value;
    Node next,prev;
    Node(int k,int v){
        key=k;
        value=v;
    }
}
class CDLLNode{
    Node head;
    public CDLLNode(){
        head=null;
    }
    Node addAtHead(int key, int val){
        Node nn=new Node(key,val);
        nn.next=nn;nn.prev=nn;
        if(head==null){
            head=nn;
            return nn;
        }
        Node last=head.prev;
        nn.next=head;
        head.prev=nn;
        nn.prev=last;
        last.next=nn;
        head=nn;
        return nn;
    }
    int deleteAtLast(){
        if(head==null)return -1;
        Node last=head.prev;
        int ans=last.key;
        if(head==last){
            head=null;
            return ans;
        }
        Node last_scnd=last.prev;
        last_scnd.next=head;
        head.prev=last_scnd;
        return ans;
    }
    void moveFront(Node nn){
        if(head==nn)return ;
        nn.prev.next=nn.next;
        nn.next.prev=nn.prev;
        Node last= head.prev;
        last.next=nn;
        nn.next=head;
        head.prev=nn;
        nn.prev=last;
        head=nn;
        return ;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */