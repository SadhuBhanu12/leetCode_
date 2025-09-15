class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[]=text.split(" ");
        int count=0;
       for (int i=0;i<arr.length;i++){
        String str=arr[i];
        for (char a:str.toCharArray()){
            if (brokenLetters.contains(a+"")){
                count++;
            break;
            }
        }
       }
       return arr.length-count;
    }
}