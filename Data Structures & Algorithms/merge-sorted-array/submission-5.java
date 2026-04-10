class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last=m+n-1;
        int n1=m-1;
        int n2=n-1;
        while(last>=0){
            if(n1>=0 &&n2>=0){
                nums1[last]=nums1[n1]>nums2[n2]?nums1[n1--]:nums2[n2--];
            }else if(n2>=0){
                nums1[last]=nums2[n2--];
            }
            last--;
        }
    }
}