class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> list=new ArrayList<>();
       Set<Integer> set = new HashSet<>();
        List<Integer> list2=new ArrayList<>();
for (int num : nums) {
    set.add(num);
}

for (int i = lower; i <= upper; i++) {
    if (!set.contains(i)) {
        list2.add(i);
    }
}
        boolean flag=false;
        int num=0;
        int num1=0;
        for(int i=0;i<list2.size();i++){
            if(!flag){
                flag=true;
                num=list2.get(i);
                num1=list2.get(i);
            continue;
            }

            if(list2.get(i)!=num+1 ){
                flag=false;
                list.add(new ArrayList<>(Arrays.asList(num1,num)));
flag=true;
                num=list2.get(i);
                num1=list2.get(i);
            }
            else{
                num=list2.get(i);

            }

        }
        if(flag){
            list.add(new ArrayList<>(Arrays.asList(num1,num)));
        }
        return list;
    }
}