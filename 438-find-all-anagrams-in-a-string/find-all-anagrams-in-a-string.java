class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<p.length();i++)map1.put(p.charAt(i),map1.getOrDefault(p.charAt(i),0)+1);
        int l=0;
        int len=0;
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<s.length();i++){
          map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
            
             if((map1.containsKey(s.charAt(i))  && map2.get(s.charAt(i))<=map1.get(s.charAt(i)))){
                len++;
                  
            }
            while(len==p.length()){
                if(i-l+1==p.length())list.add(l);
        
              char a1=s.charAt(l);
                map2.put(a1,map2.get(a1)-1);
                if(map1.containsKey(a1) &&map2.get(a1)<map1.get(a1))len--;
                l++;
                }

            }
            
            

        
        return list;
    }
}