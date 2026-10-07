class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        gener(candidates,target,0,new ArrayList<>(),0,list);
        return list;
    }
    public void gener(int arr[],int tar,int index,List<Integer> curr,int sum, List<List<Integer>> list){
        if(sum==tar){
            list.add(new ArrayList<>(curr));
            return;
        }
        if(sum>tar)return;
        if(index>=arr.length)return;
           curr.add(arr[index]);
        gener(arr,tar,index,curr,sum+arr[index],list);
   curr.remove(curr.size()-1);
        gener(arr,tar,index+1,curr,sum,list);
      

    }
    
}