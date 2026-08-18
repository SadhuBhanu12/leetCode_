class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int n=words.length;
        if(n==1){
            return 1;
        }
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                sb.append(arr[words[i].charAt(j)-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}