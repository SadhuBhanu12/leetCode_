class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        double maxSum = 0;

       
        if (nums.length < k) {
          
            return -1;
        }

    
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        maxSum = windowSum;

 
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum/k;
    }
}