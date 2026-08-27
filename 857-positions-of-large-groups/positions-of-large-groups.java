class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list=new ArrayList<>();
        char prev=s.charAt(0);
        int start=0;
        int count=1;
        for(int i=1;i<s.length();i++){
            if(prev==s.charAt(i)){
                count++;
            }
            else{
                if(count>=3){
                    list.add(new ArrayList<>(Arrays.asList(start,i-1)));
                    start=i;
                    prev=s.charAt(i);
                    count=1;
                }
                else{
                    start=i;
                    prev=s.charAt(i);
                    count=1;
                }
            }
        }
        if(count>=3){
            list.add(new ArrayList<>(Arrays.asList(start,s.length()-1)));
              
        }
        return list;
    }
}