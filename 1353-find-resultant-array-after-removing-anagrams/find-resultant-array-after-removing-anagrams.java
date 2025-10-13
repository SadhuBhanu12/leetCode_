class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> res=new ArrayList<>();
        for (int i=0;i<words.length;i++){
            res.add(words[i]);
        }
        for (int i=1;i<res.size();i++){
            if (check(res.get(i-1),res.get(i))){
                res.remove(i);
                i--;
            }
        }
        return res;
    }
    public boolean check(String a,String b){
        if (a.length()!=b.length())return false;
        HashMap<Character,Integer> a1=new HashMap<>();
        for (char ar:a.toCharArray()){
            a1.put(ar,a1.getOrDefault(ar,0)+1);
        }
         HashMap<Character,Integer> b1=new HashMap<>();
        for (char ar:b.toCharArray()){
            b1.put(ar,b1.getOrDefault(ar,0)+1);
        }
        for (char a2:a1.keySet()){
            if (a1.get(a2)!=b1.get(a2))return false;
        }
        for (char a2:b1.keySet()){
            if (a1.get(a2)!=b1.get(a2))return false;
        }
        return true;
    }
}