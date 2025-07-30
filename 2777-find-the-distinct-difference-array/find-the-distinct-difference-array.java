class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashSet<Integer> a=new HashSet<>();
        int arr[]=new int[nums.length];
        for (int i=0;i<arr.length;i++){
            a.add(nums[i]);
            HashSet<Integer> b=new HashSet<>();
            for (int j=i+1;j<nums.length;j++){
                b.add(nums[j]);
            }
            arr[i]=(a.size()-b.size());

        }
        return arr;
    }
}