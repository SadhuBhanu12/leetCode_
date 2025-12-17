class Solution {
    public int[] finalPrices(int[] prices) {
        for (int i=0;i<prices.length;i++){
            int ele=prices[i];
            int sub=0;
            for (int j=i+1;j<prices.length;j++){
                if (prices[j]<=prices[i]){
                    sub=prices[j];
                    break;
                }
            }
            prices[i]=ele-sub;
        }
        return prices;
    }
}