class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % 2 == 1) {
            return false;
        }

        boolean[] dp = new boolean[(sum / 2) + 1];
        dp[0] = true;

        for (int j = 0; j < nums.length; j++) {
            for (int i = sum / 2; i >= nums[j]; i--) {
                if (dp[i - nums[j]]) {
                    dp[i] = true;
                }
            }
        }

        return dp[sum / 2];
    }
}