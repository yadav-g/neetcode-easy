class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> valueIndex=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(valueIndex.containsKey(nums[i])&& i-valueIndex.get(nums[i])<=k){
                return true;
            }
                valueIndex.put(nums[i],i);
            }
        return false;
    }
}