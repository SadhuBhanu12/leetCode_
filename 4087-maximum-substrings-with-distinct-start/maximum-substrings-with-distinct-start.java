class Solution {
    public int maxDistinct(String s) {
        int count=0;
       int arr[]=new int[26];
       for (int i:s.toCharArray()){
        if (arr[i-'a']==0)count++;
        arr[i-'a']++;
       }
       return count;
    }
}