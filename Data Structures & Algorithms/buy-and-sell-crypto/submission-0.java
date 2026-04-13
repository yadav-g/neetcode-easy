class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    maxProfit=Math.max(maxProfit,arr[j]-arr[i]);
                }
            }
        }
        return maxProfit;
    }
}
