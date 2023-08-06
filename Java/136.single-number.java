/*
 * [136] Single Number
 */

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            hMap.put(num, hMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
