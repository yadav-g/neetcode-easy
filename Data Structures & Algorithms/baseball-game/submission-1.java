class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> valStack=new Stack<>();
       for(String op:operations){
        if(op.equals("+")){
            int top=valStack.pop();
            int newTop=top+valStack.peek();
            valStack.push(top);
            valStack.push(newTop);
        }else if(op.equals("C")){
            valStack.pop();
        }else if(op.equals("D")){
            valStack.push(2*valStack.peek());
        }else{
            valStack.push(Integer.valueOf(op));
        }
       }
        int total=0;
        for(int num:valStack){
            total+=num;
        }
        return total;
    }
}