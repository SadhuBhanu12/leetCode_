class Solution {
    public boolean isvowel(char a){
        return "aeiouAEIOU".indexOf(a)>=0;
    }
    public String sortVowels(String s) {
     
 


        ArrayList<Character> list=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if (isvowel(s.charAt(i)))list.add(s.charAt(i));
        }
        Collections.sort(list);
        int c=0;
        StringBuilder str=new StringBuilder();
        for (int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                str.append(list.get(c++));
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}