/*
 * [118] Pascal's Triangle
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return list;
        }
        ArrayList<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        list.add(prev);
        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            for (int j = 0; j < prev.size() - 1; j++) {
                curr.add(prev.get(j) + prev.get(j + 1));
            }
            curr.add(1);
            list.add(curr);
            prev = curr;
        }
        return list;
    }
}

