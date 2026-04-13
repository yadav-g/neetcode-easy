class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit=0;
        int minBuy=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>minBuy){
                int profit=arr[i]-minBuy;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                minBuy=arr[i];
            }
        }
        return maxProfit;
    }
}
