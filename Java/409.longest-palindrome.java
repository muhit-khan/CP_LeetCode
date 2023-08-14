/*
 * [409] Longest Palindrome
 */

class Solution {
    public int longestPalindrome(String s) {
        int[] charFrequency = new int[128]; // Assuming ASCII character set
        
        for (char c : s.toCharArray()) {
            charFrequency[c]++;
        }
        
        int palindromeLength = 0;
        boolean oddFrequencyEncountered = false;
        
        for (int frequency : charFrequency) {
            if (frequency % 2 == 0) {
                palindromeLength += frequency;
            } else {
                palindromeLength += frequency - 1;
                oddFrequencyEncountered = true;
            }
        }
        
        // If at least one character had odd frequency, we can add 1 to the palindrome length
        if (oddFrequencyEncountered) {
            palindromeLength += 1;
        }
        
        return palindromeLength;
    }
}

