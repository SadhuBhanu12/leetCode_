class Solution {
    public int[] rearrangeArray(int[] nums) {
       int pos1=0;
       int pos2=1;
       int arr[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        if(nums[i]<0){
            arr[pos2]=nums[i];
            pos2+=2;
        }
        else{
            arr[pos1]=nums[i];
            pos1+=2;
        }
       } 
       return arr;
    }
}