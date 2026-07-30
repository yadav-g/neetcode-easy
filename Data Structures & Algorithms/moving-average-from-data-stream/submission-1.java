class MovingAverage {
    int size;
    List<Integer> vals;
    public MovingAverage(int size) {
        this.size=size;
        vals=new ArrayList<>();
    }
    
    public double next(int val) {
        if(vals.size()==size){
            vals.remove(0);
             
        }
            
         vals.add(val);
        double sum = vals.stream()
                 .mapToInt(Integer::intValue)
                 .sum();
            return sum/vals.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
