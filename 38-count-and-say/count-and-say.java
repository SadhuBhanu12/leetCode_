class Solution {
    public String countAndSay(int n) {
        String current = "1";

        for (int step = 2; step <= n; step++) {
            StringBuilder next = new StringBuilder();
            int freq = 1;
            char previous = current.charAt(0);

            for (int index = 1; index < current.length(); index++) {
                char ch = current.charAt(index);

                if (ch == previous) {
                    freq++;
                } else {
                    next.append(freq).append(previous);
                    previous = ch;
                    freq = 1;
                }
            }

            next.append(freq).append(previous);
            current = next.toString();
        }

        return current;
    }
}