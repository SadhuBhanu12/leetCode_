class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        String str="123456789";
        String str1=String.valueOf(low);
        String str2=String.valueOf(high);
        for(int i=str1.length();i<=str2.length();i++){
            for(int j=0;j<=9-i;j++){
                int val=Integer.parseInt(str.substring(j,j+i));
                if(val>=low&& val<=high)list.add(val);
            }
        }
        return list;

    }
}