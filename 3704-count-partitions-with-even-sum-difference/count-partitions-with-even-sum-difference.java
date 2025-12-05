class Solution {
    public int countPartitions(int[] nums) {
        int l=0;
        int sum=0;
        int r=nums.length-1;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int leftsum=0;
        int count=0;
        while(l<r){
            leftsum=leftsum+nums[l];
            sum=sum-nums[l];
            if ((leftsum-sum)%2==0)count++;
            l++; 
        }
        return count;
    }
}