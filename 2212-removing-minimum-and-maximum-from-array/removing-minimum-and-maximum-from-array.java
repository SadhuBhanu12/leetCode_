class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        int option1 = maxIndex + 1;
        int option2 = n - minIndex;
        int option3 = (minIndex + 1) + (n - maxIndex);

        return Math.min(option1, Math.min(option2, option3));
    }
}