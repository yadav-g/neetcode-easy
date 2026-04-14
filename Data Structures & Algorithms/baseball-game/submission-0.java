class Solution {
    public int calPoints(String[] operations) {
        List<Integer> nums=new ArrayList<>();
        int i=-1;
        for(String s:operations){
            if(!s.equals("+") && !s.equals("C") && !s.equals("D")){
                nums.add(Integer.valueOf(s));
                i++;
            }else if(s.equals("D")){
                nums.add(nums.get(i)*2);
                i++;
            }else if(s.equals("+")){
                nums.add(nums.get(i-1)+nums.get(i));
                i++;
            }else{
                nums.remove(i);
                i--;
            }
        }
        int total=0;
        for(int num:nums){
            total+=num;
        }
        return total;
    }
}