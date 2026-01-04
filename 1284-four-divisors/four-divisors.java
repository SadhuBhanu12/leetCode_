class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int arr[]=divi(nums[i]);
            if (arr[1]==4) sum+=arr[0];
        }
        return sum;
    }

    public int[] divi(int num){
        int sum=num+1;
        int count=2;
        for (int i=2;i*i<=num && count<=4;i++){
            if (num%i==0){
                int j=num/i;
                if(i==j){
                    sum+=i;
                    count++;
                } else {
                    sum+=i+j;
                    count+=2;
                }
            }
        }
        return new int[]{sum,count};
    }
}
