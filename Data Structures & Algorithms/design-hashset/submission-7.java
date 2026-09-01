class MyHashSet {

    private List<Integer> l ;
    public MyHashSet() {
        this.l = new ArrayList<>();
    }
    
    public void add(int key) {
        if(this.contains(key)) return;
        l.add(key);
    }
    
    public void remove(int key) {
        for(int i=0;i<l.size();i++){
            if(l.get(i) == key) l.remove(i);
        }
    }
    
    public boolean contains(int key) {
        for(int k : this.l){
            if(k == key) return true;
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