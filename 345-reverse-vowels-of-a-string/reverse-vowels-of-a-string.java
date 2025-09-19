class Solution {
    public String reverseVowels(String s) {
        StringBuilder vowel=new StringBuilder();
        String vowel1="aeiouAEIOU";
        for (char a1:s.toCharArray()){
            if (vowel1.indexOf(a1)>=0){
                vowel.append(a1);
            }
        }
        vowel.reverse();
        int r=0;
        StringBuilder res=new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (vowel1.indexOf(s.charAt(i))>=0){
                res.append(vowel.charAt(r++));
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}