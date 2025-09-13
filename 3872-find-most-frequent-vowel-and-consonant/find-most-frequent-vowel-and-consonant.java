class Solution {
    public int maxFreqSum(String s) {
      int arr[]=new int[26];
      int max_cons=0;
      int max_vow=0;
      for (int j=0;j<s.length();j++){
        arr[s.charAt(j)-'a']++;
        int i=s.charAt(j)-'a';
        if ((i==0||i==4||i==8||i==14||i==20)&&(arr[i]>max_vow)){
            max_vow=arr[i];
        }
        else if ((arr[i]>max_cons) && (i!=0 && i!=4 && i!=8  && i!=14  && i!=20)){
            max_cons=arr[i];
        }
      } 
      
     
        
     System.out.println(Arrays.toString(arr));
      return max_cons+max_vow;
    }
}