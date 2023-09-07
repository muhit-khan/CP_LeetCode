/*
 * [5] Longest Palindromic Substring
 */


class Solution {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();  // Convert the string to lowercase for case-insensitive comparison
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }
        return true;  // All characters matched, it's a palindrome
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n]; // dp[i][j] indicates whether substring from index i to j is palindrome
        
        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        
        int start = 0; // Starting index of the longest palindrome substring
        int maxLength = 1; // Length of the longest palindrome substring
        
        // Check for palindromic substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        
        // Check for palindromic substrings of length greater than 2
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1; // Ending index of the current substring
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (len > maxLength) {
                        start = i;
                        maxLength = len;
                    }
                }
            }
        }
        
        return s.substring(start, start + maxLength);
    }
}
