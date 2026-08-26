class Solution {

    public int removeCoveredIntervals(int[][] intervals) {

        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(b[1], a[1]);
            }
        });

        list.add(new int[]{intervals[0][0], intervals[0][1]});

        for (int i = 1; i < intervals.length; i++) {

            int val1 = list.get(list.size() - 1)[0];
            int val2 = list.get(list.size() - 1)[1];

            int val3 = intervals[i][0];
            int val4 = intervals[i][1];

            if (val1 <= val3 && val4 <= val2) {
                
                continue;
            } else {
                list.add(new int[]{val3, val4});
            }
        }

        return list.size();
    }
}