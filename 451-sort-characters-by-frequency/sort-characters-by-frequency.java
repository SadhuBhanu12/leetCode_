class Solution {
    public String frequencySort(String s) {
        int arr[]=new int[128];
        for (int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++){
            int max=0;
            int r=-1;
            for (int j=0;j<arr.length;j++){
                if (arr[j]>=max && arr[j]!=0){
                max=arr[j];

                r=j;
                
                }
            }
            if (r == -1 || max == 0) break;
            for (int k=0;k<max;k++){
                sb.append((char)r);
            }
            arr[r]=0;
           
        }
        return sb.toString();
    }
}