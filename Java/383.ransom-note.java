/*
 * [383] Ransom Note
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> charFreq = new HashMap<>();
        
        for (char c : magazine.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (!charFreq.containsKey(c) || charFreq.get(c) <= 0) {
                return false;
            }
            charFreq.put(c, charFreq.get(c) - 1);
        }
        return true;
    }
}
