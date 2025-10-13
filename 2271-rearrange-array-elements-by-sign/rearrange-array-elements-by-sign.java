class Solution {
    public int[] rearrangeArray(int[] nums) {
       int neg[]=new int[nums.length/2];
        int pos[]=new int[nums.length/2];
        int c1=0;
        int c2=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]<0)neg[c1++]=nums[i];
            if (nums[i]>0)pos[c2++]=nums[i];
        }
        int r1=0;
        int r2=0;
        int count=0;
        for (int i=0;i<nums.length/2;i++){
            nums[count++]=pos[r1++];
               nums[count++]=neg[r2++];
        }
        return nums;
    }
}