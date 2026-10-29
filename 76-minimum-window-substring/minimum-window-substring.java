class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        int l=0;
        int len=0;
        String str="";
        int str_len=s.length();
        for(int i=0;i<s.length();i++){  
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
            if(map1.containsKey(s.charAt(i))&& map2.get(s.charAt(i))<=map1.get(s.charAt(i)))len++;
            while(len==t.length()){
                String str1=s.substring(l,i+1);
                if(str1.length()<=str_len){
                    str=str1;
                    str_len=str1.length();
                }
                char a1=s.charAt(l);
                map2.put(a1,map2.get(a1)-1);
                if(map1.containsKey(a1) && map2.get(a1)<map1.get(a1))len--;
                l++;
                


            }

        }
        return str;
    }
}