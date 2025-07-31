class Solution {
    public void nextPermutation(int[] nums) {
        int count=0;
        int pivot=-1;
        int index=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pivot=nums[i-1];
                index=i-1;
                break;
            }
            else{
                count++;
            }
        }
        if (count==nums.length-1) reversearr(nums,0,nums.length-1);
        else{
            int maxele=0;
            int index1=nums.length-1;
            for (int i=nums.length-1;i>index;i--){
                if (nums[i]>pivot){
                    maxele=nums[i];
                    index1=i;
                    break;
                }
            }
           
            int temp=nums[index1];
            nums[index1]=nums[index];
            nums[index]=temp;
          
           
            reversearr(nums,index+1,nums.length-1);
        }
    }
    public int[] reversearr(int arr[],int i,int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
