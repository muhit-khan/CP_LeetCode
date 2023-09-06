/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int ln = Math.max(word1.length(), word2.length());
        StringBuilder mergedString = new StringBuilder();
        for (int i = 0; i < ln; i++) {
            if (i < word1.length()) {
                mergedString.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                mergedString.append(word2.charAt(i));
            }
        }
        return mergedString.toString();
    }
}

// @lc code=end

