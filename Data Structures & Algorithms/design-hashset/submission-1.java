class MyHashSet {
    List<Integer> li;

    public MyHashSet() {
        this.li = new ArrayList<>();
    }
    
    public void add(int key) {
        for(int i : li){
            if(i == key) return;
        }
        li.add(key);
    }
    
    public void remove(int key) {
        for(int i=0;i<li.size();i++){
            if(li.get(i) == key){
                li.remove(i);
                return ;
            }
        }
        return;
    }
    
    public boolean contains(int key) {
        return this.li.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */