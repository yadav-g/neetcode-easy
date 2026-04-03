class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> valueIndex=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value=target-nums[i];
            if (valueIndex.containsKey(value) && valueIndex.get(value)!=i){
                return new int[]{valueIndex.get(value),i};
            }
            valueIndex.put(nums[i],i);
        }
        return new int[]{};
    }
}
