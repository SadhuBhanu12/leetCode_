class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arr[]=new int[nums.length];
        int index=0;
        for (int i=0;i<nums.length;i++){
            int l=0;
            int r=0;
            for (int j=0;j<i;j++){
                l+=nums[j];
            }
            for (int k=i+1;k<nums.length;k++){
                r+=nums[k];
            }
            arr[index++]=Math.abs(l-r);
        }
        return arr;
    }
}