class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int repeated = 0;
        int missing = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = grid[i][j];
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        for (int i = 1; i <= n * n; i++) {
            int count = map.getOrDefault(i, 0);

            if (count == 2) {
                repeated = i;
            } else if (count == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}