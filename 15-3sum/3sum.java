class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int target = -nums[i];

            List<int[]> pairs = two(nums, target, i);

            for (int[] arr : pairs) {
                set.add(Arrays.asList(nums[i], nums[arr[0]], nums[arr[1]]));
            }
        }

        return new ArrayList<>(set);
    }

    public List<int[]> two(int nums[], int target, int start) {

        List<int[]> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = start + 1; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                res.add(new int[] { map.get(target - nums[i]), i });
            }

            map.put(nums[i], i);
        }

        return res;
    }
}