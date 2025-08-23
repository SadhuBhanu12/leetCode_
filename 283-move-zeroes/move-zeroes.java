class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int iter=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[iter++]=nums[i];
            }
            else{
                count++;
            }
        }
        for (int i=iter;i<nums.length;i++){
            nums[i]=0;
        }

    }
}