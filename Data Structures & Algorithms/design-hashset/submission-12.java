class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data = data;
    }
}
class BST{

    private TreeNode root;

    public void add(int key){
        root = insert(root,key);
    }

    public void remove(int key){
        root = delete(root,key);
    }

    public boolean contains(int key){
        return search(root,key);
    }

    private TreeNode delete(TreeNode node , int key){
        if(node == null) return null;
        if(key < node.data) {
            node.left = delete(node.left,key);
        }else if(key > node.data){
            node.right = delete(node.right,key);
        }
        else{
            if(node.right ==  null) return node.left;
            if(node.left == null) return node.right;
            TreeNode temp = minValueNode(node.right);
            node.data = temp.data;
            node.right = delete(node.right,temp.data);
        }
        return node;
    }

    private TreeNode minValueNode(TreeNode node ){
        while(node.left != null) node= node.left;
        return node;
    }

    private TreeNode insert(TreeNode node , int key){
        if(node == null) return new TreeNode(key);
        if(key < node.data) node.left = insert(node.left,key);
        else if(key > node.data) node.right = insert(node.right,key);
        return node;
    }

    private boolean search(TreeNode node , int key){
        if(node == null) return false;
        if(node.data == key) return true;
        if(key < node.data) return search(node.left,key);
        return search(node.right,key);
    }

}


class MyHashSet {

    private BST [] buckets;
    public MyHashSet() {
        buckets = new BST[10000];
        for(int i=0;i<buckets.length;i++){
            buckets[i] = new BST();
        }
    }
    
    public void add(int key) {
        int idx = hash(key);
        if(!buckets[idx].contains(key)){
            buckets[idx].add(key);
        }
    }
    
    public void remove(int key) {
        int idx = hash(key);
        buckets[idx].remove(key);
    }

    private int hash(int key){
        return key % 10000;
    }
    
    public boolean contains(int key) {
        int idx = hash(key);
        return buckets[idx].contains(key);
    }
}