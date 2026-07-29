class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() == 1) return s;

        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char a : s.toCharArray())
            map.put(a, map.getOrDefault(a, 0) + 1);

        char arr[] = new char[s.length()];
        int l = 0;
        int r = arr.length - 1;
        char mid = '\0';   

        for (char i : map.keySet()) {
            char key = i;
            int value = map.get(i);

            if (value % 2 == 0) {
                while (value > 0) {
                    arr[l] = key;
                    arr[r] = key;
                    value -= 2;
                    l++;
                    r--;
                }
            }

            if (value % 2 == 1) {
                while (value > 1) {
                    arr[l] = key;
                    arr[r] = key;
                    value -= 2;
                    l++;
                    r--;
                }
                mid = key;     
            }
        }

        if (mid != '\0')
            arr[l] = mid;     

        return new String(arr); 
    }
}