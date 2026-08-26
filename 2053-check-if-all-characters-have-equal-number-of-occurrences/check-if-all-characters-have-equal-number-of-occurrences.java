class Solution {
    public boolean areOccurrencesEqual(String s) {
       int arr[]=new int[26];
       int max=0;
       for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            max=Math.max(arr[s.charAt(i)-'a'],max);
       } 
       for(int i=0;i<26;i++)if(arr[i]!=max && arr[i]!=0)return false;
       return true;
    }
}