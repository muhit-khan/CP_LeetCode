/*
 * [169] Majority Element
 */

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            hMap.put(num, hMap.getOrDefault(num, 0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE;
        int majorityElement = -1;

        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            int freq = entry.getValue();
            if (freq > maxFreq) {
                maxFreq = freq;
                majorityElement = entry.getKey();
            }
        }

        return majorityElement;
    }
}