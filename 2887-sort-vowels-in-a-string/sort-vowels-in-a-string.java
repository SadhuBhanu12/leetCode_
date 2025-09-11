class Solution {
    public String sortVowels(String s) {
        HashMap<Integer,Character> map=new HashMap<>();
  List<Character> set = Arrays.asList('a','e','i','o','u','A','E','I','O','U');


        ArrayList<Character> list=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if (set.contains(s.charAt(i)))list.add(s.charAt(i));
        }
        Collections.sort(list);
        int c=0;
        StringBuilder str=new StringBuilder();
        for (int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                str.append(list.get(c++));
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}