class Solution {
    public int[] closestPrimes(int left, int right) {
       ArrayList<Integer> a=new ArrayList<>();
       int sum=Integer.MAX_VALUE;
       int arr[]={-1,-1};
       for(int i=left;i<=right;i++){
        if (prime(i)){
            a.add(i);
        }
       }
         for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i + 1) - a.get(i) < sum) { 
                sum = a.get(i + 1) - a.get(i);
                arr[0] = a.get(i);
                arr[1] = a.get(i + 1);
                
            }
        }
        return arr;
    }
    public boolean prime(int num){
       if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i*i<=num; i +=2) {  
            if (num % i == 0) return false;
        }
        return true;
    
    
    }
    }