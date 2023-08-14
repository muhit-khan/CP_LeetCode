/*
 * [3] Longest Substring Without Repeating Characters
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hMap = new HashMap<>();
        int maxCount = 0;
        int start = 0;  // Start index of the current substring

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (hMap.containsKey(currentChar)) {
                // Update the start index to the next position after the last occurrence of the repeated character
                start = Math.max(start, hMap.get(currentChar) + 1);
            }
            
            hMap.put(currentChar, i); // Store the current character's index
            
            // Calculate the length of the current substring without repeating characters
            int currentLength = i - start + 1;
            
            // Update the maximum length
            maxCount = Math.max(maxCount, currentLength);
        }
        
        return maxCount;
    }
}
