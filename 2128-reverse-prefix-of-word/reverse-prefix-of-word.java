class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder a=new StringBuilder();
        for (char i:word.toCharArray()){
            if (i==ch){
                a.append(i);
               return a.reverse().toString() + word.substring(a.length());
            }
            else{
                a.append(i);
            }
        }
        return word;
    }
}