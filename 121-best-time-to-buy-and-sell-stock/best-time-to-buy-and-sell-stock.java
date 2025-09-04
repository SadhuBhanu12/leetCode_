class Solution {
    public int maxProfit(int[] prices) {
        int buy=-1;
        int profit=0;
        
     int arr[]=new int[prices.length];
     arr[arr.length-1]=prices[prices.length-1];
     for (int i=prices.length-2;i>=0;i--){
        arr[i]=Math.max(prices[i],arr[i+1]);
     }
     System.out.println(Arrays.toString(arr));
     int max1=0;
     for (int i=0;i<prices.length;i++){
        if (arr[i]-prices[i]>max1){
            max1=arr[i]-prices[i];
        }
     }
     return max1;
    }
}