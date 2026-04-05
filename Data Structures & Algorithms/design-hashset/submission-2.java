class MyHashSet {
    private List<Integer> hashSetList;
    public MyHashSet() {
        this.hashSetList=new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key)){
            hashSetList.add(key);
        }
    }
    
    public void remove(int key) {
        if(contains(key)){
            hashSetList.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        for(int val:hashSetList){
            if(val==key){
                return true;
            }
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