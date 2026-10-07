class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char c : tasks) {
            freq[c - 'A']++;
        }

        int max = 0;

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, freq[i]);
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] == max) {
                count++;
            }
        }

        int ans = (max - 1) * (n + 1) + count;

        return Math.max(ans, tasks.length);
    }
}