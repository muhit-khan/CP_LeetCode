class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Index to keep track of the position for non-zero elements
        
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element to its correct position
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;
                
                nonZeroIndex++; // Increment the nonZeroIndex
            }
        }
    }
}