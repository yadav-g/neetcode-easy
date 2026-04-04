class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement=nums[0];
        int countMajorityElement=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]==majorityElement){
                countMajorityElement++;
            }else{
                countMajorityElement--;
                if (countMajorityElement==0){
                    majorityElement=nums[i];
                    countMajorityElement=1;
                }
            }
        }
        return majorityElement;
    }

}