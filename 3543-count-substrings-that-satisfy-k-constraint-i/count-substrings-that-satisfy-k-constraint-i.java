class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int arr[] = new int[2];
        int l = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '0')
                arr[0]++;

            if (s.charAt(i) == '1')
                arr[1]++;

            while (arr[0] > k && arr[1] > k) {
                if (s.charAt(l) == '0')
                    arr[0]--;
                else
                    arr[1]--;

                l++;
            }

            count += i - l + 1;
        }

        return count;
    }
}