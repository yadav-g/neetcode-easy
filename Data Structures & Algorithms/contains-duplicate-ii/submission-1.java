class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> valueIndex=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!valueIndex.containsKey(nums[i])){
                valueIndex.put(nums[i],i);
            }else{
                int currIdx=i;
                int prevIdx=valueIndex.get(nums[i]);
                if(Math.abs(currIdx-prevIdx)<=k){
                    return true;
                }
                valueIndex.put(nums[i],i);
            }
        }
        return false;
    }
}