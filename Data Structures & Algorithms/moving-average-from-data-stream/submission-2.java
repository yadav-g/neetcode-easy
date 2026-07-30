class MovingAverage {
    int size;
    Queue<Integer> vals;
    double sum;
    public MovingAverage(int size) {
        this.size=size;
        vals=new LinkedList<>();
        sum=0;
    }
    
    public double next(int val) {
        if(vals.size()==size){
            sum-=vals.poll();  
        }
            
        vals.offer(val);
        sum+=val;
        
            return sum/vals.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
