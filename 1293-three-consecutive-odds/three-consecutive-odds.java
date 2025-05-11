class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
       int str=0;
       int count=0;
       int num=0;
       int end=arr.length;
       while(str<end){
        if((arr[str]%2==1 && num%2==1 )||(arr[str]%2==1 && num==0 )){
            num=arr[str];
             System.out.println(arr[str]);
            count++;
           
        }
        else{
            count=(count>=3)?count:0;
            num=0;
        }
        str++;
       } 
     System.out.println(count);
       return count>=3;
    }
}