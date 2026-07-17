class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<=right){
            int val=numbers[left]+numbers[right];
            if(val==target)return new int[]{left+1,right+1};
            else if(val>target){
                right--;
            }
            else if (val<target){
                left++;
            }

        }
        return new int []{-1,-1};
    }
}