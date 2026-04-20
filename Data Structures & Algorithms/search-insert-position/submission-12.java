class Solution {
    public int searchInsert(int[] nums, int target) {
        int possibleIndex=0;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                possibleIndex=mid+1;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return possibleIndex;
        
        
    }
}