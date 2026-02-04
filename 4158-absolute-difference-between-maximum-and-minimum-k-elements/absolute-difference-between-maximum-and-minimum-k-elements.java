class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum1=0;
        int sum2=0;
        int l=0;
        int r=nums.length-1;
        int c=0;
        while(k>0){
            if(c==k){
                break;
            }
            sum1+=nums[l];
            sum2+=nums[r];
            l++;
            r--;
            k--;
        }
        return Math.abs(sum1-sum2);
    }
}