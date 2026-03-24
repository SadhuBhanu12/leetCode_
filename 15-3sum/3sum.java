class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> resultSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int target = -(nums[i] + nums[j]);

                if (seen.contains(target)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], target);
                    Collections.sort(temp);
                    resultSet.add(temp);
                }

                seen.add(nums[j]);
            }
        }

        list.addAll(resultSet);
        return list;
    }
}