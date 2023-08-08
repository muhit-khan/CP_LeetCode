/*
 * [119] Pascal's Triangle II
 */

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        list.add(prev);
        for (int i = 1; i <= rowIndex; i++) {
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            List<Integer> prevRow = list.get(i - 1); // Get the previous row
            for (int j = 0; j < prevRow.size() - 1; j++) {
                curr.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            curr.add(1);
            list.add(curr);
            prev = curr;
        }
        return list.get(rowIndex);
    }
}
