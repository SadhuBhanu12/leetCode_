class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        int s1=nums[0];
        int s2=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            l[i]=s1;
            r[nums.length-i-1]=s2;
            s1+=nums[i];
            s2+=nums[nums.length-i-1];

        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(l[i]-r[i]);
        }
        return nums;
    }
}