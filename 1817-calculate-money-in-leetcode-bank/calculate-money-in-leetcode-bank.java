class Solution {
    public int totalMoney(int n) {
        int count1=1;
        int count7=1;
        int sum=0;
        for(int i=1;i<=n;i++){

              System.out.println(count1);
            sum+=(count1++);
            if (i%7==0){
                count1=count7+1;
                count7++;
            }
          
        }
        return sum;
    }
}