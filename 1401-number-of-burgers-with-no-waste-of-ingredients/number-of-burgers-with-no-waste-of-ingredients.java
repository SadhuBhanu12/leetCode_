class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {

        List<Integer> list = new ArrayList<>();

       
        if (tomatoSlices % 2 != 0) {
            return list;
        }

        int jumbo = tomatoSlices / 2 - cheeseSlices;
        int small = 2 * cheeseSlices - tomatoSlices / 2;

        if (jumbo < 0 || small < 0) {
            return list;
        }

        list.add(jumbo);
        list.add(small);

        return list;
    }
}