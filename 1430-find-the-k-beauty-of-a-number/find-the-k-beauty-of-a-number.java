class Solution {
    public int divisorSubstrings(int num, int k) {
        String str=Integer.toString(num);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<str.length()-k+1;i++){
            list.add(Integer.parseInt(str.substring(i,i+k)));
        }
        int count=0;
        for(int i=0;i<list.size();i++)if(list.get(i)!=0 &&num%list.get(i)==0 )count++;
        return count;
    }
}