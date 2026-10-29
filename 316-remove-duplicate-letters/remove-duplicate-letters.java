class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            map.put(ch, map.get(ch) - 1);

            if (set.contains(ch)) {
                continue;
            }

            while (str.length() > 0 &&
                   str.charAt(str.length() - 1) > ch &&
                   map.get(str.charAt(str.length() - 1)) > 0) {

                set.remove(str.charAt(str.length() - 1));
                str.deleteCharAt(str.length() - 1);
            }

            str.append(ch);
            set.add(ch);
        }

        return str.toString();
    }
}