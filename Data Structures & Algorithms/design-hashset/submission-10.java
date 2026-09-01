class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
    }
}
class MyHashSet {

    private ListNode [] set;
    public MyHashSet() {
        set = new ListNode[10000];
        for(int i=0;i<10000;i++){
            set[i] = new ListNode(0);
        }
    }
    
    public void add(int key) {
        int hash = key % 10000;
        ListNode curr = set[hash];
        while(curr.next != null){
            if(curr.next.data == key) return ;
            curr = curr.next;
        }
        curr.next = new ListNode(key);
    }
    
    public void remove(int key) {
        int hash = key % 10000;
        ListNode curr = set[hash];
        while(curr.next != null){
            if(curr.next.data == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    
    public boolean contains(int key) {
        int hash = key % 10000;
        ListNode curr = set[hash];
        while(curr.next != null){
            if(curr.next.data == key) return true;
            curr = curr.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */