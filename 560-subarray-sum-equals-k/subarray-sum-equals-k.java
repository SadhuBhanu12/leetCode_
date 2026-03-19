class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int l=0;
        int r=l;
        int sum=0;
        while(l!=nums.length){
            if (r==nums.length){
                r=l++;
                r=l;
                sum=0;
                continue;
            }
            sum+=nums[r];
            if (sum==k)count++;
            r++;

        }
        return count;
    }
}