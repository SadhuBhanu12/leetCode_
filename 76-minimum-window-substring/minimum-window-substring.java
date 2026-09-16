class Solution {
    public String minWindow(String s, String t) {

        if(s.length() < t.length()) return "";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char i : t.toCharArray())
            map.put(i, map.getOrDefault(i, 0) + 1);

        int l = 0;
        int len = Integer.MAX_VALUE;
        String res = "";

        HashMap<Character,Integer> map1 = new HashMap<>();

        int count = 0;

        for(int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);

            map1.put(ch, map1.getOrDefault(ch, 0) + 1);

            if(map.containsKey(ch) && map1.get(ch) <= map.get(ch))
                count++;

            while(count == t.length()) {

                if(r - l + 1 < len) {
                    len = r - l + 1;
                    res = s.substring(l, r + 1);
                }

                char left = s.charAt(l);

                map1.put(left, map1.get(left) - 1);

                if(map.containsKey(left) && map1.get(left) < map.get(left))
                    count--;

                l++;
            }
        }

        return res;
    }
}