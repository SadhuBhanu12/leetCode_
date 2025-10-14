class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if (nums.length==0|| nums.length==1)return; 
        int arr[]=new  int[k];
        int len=nums.length-1;
        for (int i=arr.length-1;i>=0;i--){
            arr[i]=nums[len--];
        }
        int arr2[]=new int[nums.length-k];
        for (int i=0;i<nums.length-k;i++){
            arr2[i]=nums[i];
        }
        int c=0;
        for (int i=0;i<k;i++)nums[i]=arr[i];
        for (int i=k;i<nums.length;i++)nums[i]=arr2[c++];

    }
}