
class Solution {
    public int change(int amount, int[] coins) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;

        for (int j = 0; j < coins.length; j++) {
            for (int i = coins[j]; i < dp.length; i++) {
                dp[i] += dp[i - coins[j]];
            }
        }

        return dp[amount];
    }
}
