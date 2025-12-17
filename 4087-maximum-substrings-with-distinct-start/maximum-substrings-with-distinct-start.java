class Solution {
    public int maxDistinct(String s) {
       HashSet<Character> map=new HashSet<>();
       for (char i:s.toCharArray())map.add(i);
       return map.size(); 
    }
}