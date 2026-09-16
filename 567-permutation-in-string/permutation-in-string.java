class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1=new HashMap<>();
        for(char a1:s1.toCharArray())map1.put(a1,map1.getOrDefault(a1,0)+1);
        int l=0;
        int count=0;
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int r=0;r<s2.length();r++){
            map2.put(s2.charAt(r),map2.getOrDefault(s2.charAt(r),0)+1);
          if(map1.containsKey(s2.charAt(r)) && map2.get(s2.charAt(r))<=map1.get(s2.charAt(r)))
    count++;
            while(count==s1.length()){
                if(r-l+1==s1.length())return true;
                char a12=s2.charAt(l);
                map2.put(a12,map2.get(a12)-1);
                if(map1.containsKey(a12) &&map2.get(a12)<map1.get(a12))count--;
                l++;
            }
        }
        return false;
    }
}