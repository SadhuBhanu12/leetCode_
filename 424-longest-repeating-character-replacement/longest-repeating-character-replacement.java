class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int count=0;
        int arr[]=new int[26];
        int res=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
            count++;
            int val=0;
            for(int j=0;j<26;j++){
                val=Math.max(val,arr[j]);
            }
            while(count-val>k){
                arr[s.charAt(l)-'A']--;
                count--;
                l++;
                val=0;
                for(int j=0;j<26;j++){
                    val=Math.max(val,arr[j]);
                }
            }
            res=Math.max(res,i-l+1);
        }
        return res;
    }
}