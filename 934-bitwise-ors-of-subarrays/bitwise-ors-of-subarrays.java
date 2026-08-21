class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> res=new HashSet<>();
        HashSet<Integer> curr=new HashSet<>();
        for(int i:arr){
            HashSet<Integer> n=new HashSet<>();
            n.add(i);
            for(int i1:curr){
                n.add(i1|i);
            }
            curr=n;
            res.addAll(curr);
        }
        return res.size();
    }
}