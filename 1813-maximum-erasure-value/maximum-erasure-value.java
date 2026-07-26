class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int l=0;
        int curr_sum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[l]);
                 curr_sum-=nums[l];
                l++;
               
            }
            set.add(nums[i]);
            curr_sum+=nums[i];
            max=Math.max(curr_sum,max);

        }
        return max;
    }
}