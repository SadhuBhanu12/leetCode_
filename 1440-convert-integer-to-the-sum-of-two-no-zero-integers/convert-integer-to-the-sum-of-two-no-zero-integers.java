class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]={0,0};
        for (int i=1;i<n;i++){
            int res=n-i;
            String a1=Integer.toString(res);
            String a2=Integer.toString(i);
            if (!a1.contains("0") && !a2.contains("0")){
                arr[0]=i;
                arr[1]=res;
                break;
            }
        }
        return arr;
    }
}