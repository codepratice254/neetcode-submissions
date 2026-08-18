class MyHashSet {
    private Set<Integer> s;

    public MyHashSet() {
        this.s = new HashSet<>();
    }
    
    public void add(int key) {
        this.s.add(key);
    }
    
    public void remove(int key) {
        this.s.remove(key);
    }
    
    public boolean contains(int key) {
        return this.s.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */