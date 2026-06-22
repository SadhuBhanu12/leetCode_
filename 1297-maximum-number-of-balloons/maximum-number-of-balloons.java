class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[]=new int[5];
        for(char a1:text.toCharArray()){
            if(a1=='b')arr[0]++;
            if(a1=='a')arr[1]++;
            if(a1=='l')arr[2]++;
            if(a1=='o')arr[3]++;
            if(a1=='n')arr[4]++;
        }
        arr[2]=arr[2]/2;
        arr[3]=arr[3]/2;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)min=Math.min(arr[i],min);
        return (min==Integer.MAX_VALUE)?0:min;
    }
}