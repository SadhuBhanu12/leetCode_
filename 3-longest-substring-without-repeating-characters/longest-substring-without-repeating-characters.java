class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;

        for (int l = 0; l < s.length(); l++) {
            int[] arr = new int[128];
            int count = 0;

            for (int r = l; r < s.length(); r++) {
                char c = s.charAt(r);

                if (arr[c] >= 1) {
                    break;
                }

                arr[c]++;
                count++;
            }

            len = Math.max(len, count);
        }

        return len;
    }
}