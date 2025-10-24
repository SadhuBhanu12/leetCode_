class Solution {
    public int nextBeautifulNumber(int n) {
        for (int i = n + 1; i <=1224445 ; i++) {
            if (check(i)) {
                return i;
            }
        }
        return -1;
    }

    public boolean check(int a) {
        int arr[] = new int[10];
        while (a > 0) {
            arr[a % 10]++;
            a = a / 10;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i && arr[i]>0) return false;
        }
        return true;
    }
}
