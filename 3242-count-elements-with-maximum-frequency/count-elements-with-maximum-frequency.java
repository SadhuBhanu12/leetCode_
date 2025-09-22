import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i : set) {
            list1.add(i);
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
