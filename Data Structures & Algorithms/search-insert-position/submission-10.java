class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int idx=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                idx=mid+1;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        
        return idx;
        
        
    }
}