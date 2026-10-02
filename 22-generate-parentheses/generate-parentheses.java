class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        back("",n,list,0,0);
        return list;
    }
    public void back(String str,int n,List<String> list,int open,int close){
        if(str.length()==n*2){
            list.add(str);
            return;
        }
        if(open<n){
            back(str+"(",n,list,open+1,close);
        }
        if(close<open){
            back(str+")",n,list,open,close+1);
        }
    }
}