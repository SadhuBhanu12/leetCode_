class Solution {
    public void sortColors(int[] nums) {
        int arr[]=new int[nums.length];
        int c1=0;
        int c2=0;
        int c3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)c1++;
            if(nums[i]==1)c2++;
            if(nums[i]==2)c3++;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count<c1){
                nums[i]=0;
                count++;
            }else if(count>=c1 && count<c1+c2){
                nums[i]=1;
                count++;
            }
            else if (count>=c2 && count<c1+c2+c3){
                nums[i]=2;
            }
        }
    }
}