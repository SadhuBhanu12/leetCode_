class Solution {
    public int maxFreqSum(String s) {
      int arr[]=new int[26];
      for (int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
      } 
      int max_cons=0;
      int max_vow=0;
      for (int i=0;i<arr.length;i++){
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