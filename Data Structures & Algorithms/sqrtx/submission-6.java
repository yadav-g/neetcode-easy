class Solution {
    public int mySqrt(int x) {
       int left=0;
       int right=x;
       int sqrt=0;
       while(left<=right){
        int mid=left+(right-left)/2;
        long val=(long)mid*mid;
        if(val==x){
            return mid;
        }
        if(val>x){
            sqrt=mid-1;
            right=mid-1;
        }else{
            left=mid+1;
        }
       }
       return sqrt; 
    }
}