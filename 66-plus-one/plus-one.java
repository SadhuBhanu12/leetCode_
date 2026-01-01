class Solution {
    public int[] plusOne(int[] digits) {
        int arr[]=new int[digits.length+1];
        arr[arr.length-1]++;
        for(int i=arr.length-1;i>0;i--){
            int sum=arr[i]+digits[i-1];
            
            arr[i]=sum%10;
            arr[i-1]=sum/10;
        }
        int i=0;
    while(i<arr.length && arr[i]==0){
        i++;
    }
  
  
    System.out.println(Arrays.toString(arr));
    int res[]=Arrays.copyOfRange(arr,i,arr.length);
    return res;
    }
}