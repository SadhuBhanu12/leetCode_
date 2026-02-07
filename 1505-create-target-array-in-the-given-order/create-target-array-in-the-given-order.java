class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
          
            int prev=arr[index[i]];
            for (int j=index[i]+1;j<nums.length;j++){
                    int curr=arr[j];
                    arr[j]=prev;
                    prev=curr;
            }
            System.out.println(Arrays.toString(arr));
            arr[index[i]]=nums[i];

        }
        return arr;
    }
}