class Solution {
    public int distinctSubseqII(String s) {

        int dp[] = new int[s.length() + 1];

        int MOD = 1_000_000_007;

        int last[] = new int[26];
        Arrays.fill(last, -1);

        dp[0] = 1;

        for (int i = 0; i < s.length(); i++) {

            int ch = s.charAt(i) - 'a';

            if (last[ch] != -1) {

                int last_int = last[ch];

                dp[i + 1] = (int) (
                    ((long) dp[i] * 2 - dp[last_int] + MOD) % MOD
                );

            } else {

                dp[i + 1] = (int) (
                    ((long) dp[i] * 2) % MOD
                );
            }

            last[ch] = i;
        }

        return (dp[s.length()] - 1 + MOD) % MOD;
    }
}