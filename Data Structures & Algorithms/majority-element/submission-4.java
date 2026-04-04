class Solution {
    public int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int majorityElement = nums[i];
            int count = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] == majorityElement) {
                    count++;
                }
            }
            if (count > (nums.length / 2)) {
                return majorityElement;
            }
        }
        return -1;
    }
}