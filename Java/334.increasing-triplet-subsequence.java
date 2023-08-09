class Solution {
    int left = Integer.MAX_VALUE;
    int mid = Integer.MAX_VALUE;

    public boolean increasingTriplet(int[] nums) {
        for (int num : nums) {
            if (num <= left) {
                left = num;
            } else if (num> left && num <= mid) {
                mid = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
