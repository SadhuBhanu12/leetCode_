class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=coins.length-1;j>=0;j--){
                if(coins[j]<=i && dp[i-coins[j]]!=Integer.MAX_VALUE){
                    int curr=i-coins[j];
                    min=Math.min(1+dp[curr],min);
                }
            }
          
            dp[i]=min;
        }
        if(dp[amount]==Integer.MAX_VALUE)return -1;
    return dp[amount];
    }
}