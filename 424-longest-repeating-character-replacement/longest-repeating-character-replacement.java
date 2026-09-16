class Solution {
    public int characterReplacement(String s, int k) {
        int len = 0;
        char[] arr = s.toCharArray();

        int[] freq = new int[26];

        int l = 0;
        int max = 0;

        for (int r = 0; r < s.length(); r++) {

            freq[arr[r] - 'A']++;

            max = Math.max(max, freq[arr[r] - 'A']);

            while ((r - l + 1) - max > k) {
                freq[arr[l] - 'A']--;
                l++;
            }

            len = Math.max(len, r - l + 1);
        }

        return len;
    }
}