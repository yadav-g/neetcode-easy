class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueValues=new HashSet<>();
        for (int val:nums){
            if (uniqueValues.contains(val)){
                return true;
            }
            uniqueValues.add(val);
        }
        return false;
    }
}