/*
 * [560] Subarray Sum Equals K
 */


class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            sum += nums[i];
            if (sum==k) {
                count++;
            } else if(map.containsKey(sum-k)){
                count+=map.get(nums[i]);
            }
        }
        return count;
    }
}

