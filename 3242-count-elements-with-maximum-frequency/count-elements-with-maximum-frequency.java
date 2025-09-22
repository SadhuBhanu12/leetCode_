import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!list1.contains(nums[i]))list1.add(nums[i]);
        }
      

        int arr[] = new int[list1.size()];
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            arr[list1.indexOf(nums[i])] += 1;
            max=Math.max(arr[list1.indexOf(nums[i])],max);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) sum += arr[i];
        }

        return sum;
    }
}
