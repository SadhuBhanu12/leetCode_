class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                res[i] = nums[i];
            }

            if (nums[i] > 0) {
                res[i] = nums[(i + nums[i]) % nums.length];
            }

            if (nums[i] < 0) {
                int idx = (i + nums[i]) % nums.length;
                if (idx < 0) idx += nums.length;
                res[i] = nums[idx];
            }
        }
        return res;
    }
}
