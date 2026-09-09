class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int arr[]=new int[nums.length];

        int prod=1;

        int index=-1;

        for(int i=0;i<nums.length;i++){

            if(index==-1){

                index=i;

                prod=nums[i];

                if(prod<k){
                    arr[i]=1;
                }

                continue;
            }

            else{

                prod=prod*nums[i];

                if(prod<k){

                    arr[i]=i-index+1;

                }

                else{

                    while(index<=i && prod>=k){

                        prod=prod/nums[index];

                        index++;

                    }

                    if(prod<k){
                        arr[i]=i-index+1;
                    }
                }
            }
        }


        int count=0;

        for(int i=0;i<arr.length;i++){
            count+=arr[i];
        }

        return count;
    }
}