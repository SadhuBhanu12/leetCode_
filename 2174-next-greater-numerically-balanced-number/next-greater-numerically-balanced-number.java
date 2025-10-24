class Solution {
    public int nextBeautifulNumber(int n) {
        for (int i = n + 1; i <= 1224444; i++) {
            if (check(i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean check(int x) {
        int[] arr = new int[10];
        while (x > 0) {
            arr[x % 10]++;
            x /= 10;
        }
        for (int i= 0; i < 10; ++i) {
            if (arr[i] > 0 && arr[i] != i) {
                return false;
            }
        }
        return true;
    }
}