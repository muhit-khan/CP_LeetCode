/*
 * [75] Sort Colors
 */

class Solution {
    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;
        while (mid <= right) {
            if (nums[mid]==0) {
                swap(nums, mid, left);
                left++;
                mid++;
            } else if (nums[mid]==1){
                mid++;
            } else {
                swap(nums, mid, right);
                mid++;
                right--;
            }
        }
        
    }

    private void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
