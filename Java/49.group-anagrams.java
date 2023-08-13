/*
 * [49] Group Anagrams
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hMap = new HashMap<String, List<String>>();
        for (String s : strs) {
            char charArray[] = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if (!hMap.containsKey(sorted)) {
                hMap.put(sorted, new ArrayList<String>());
            }
            hMap.get(sorted).add(s);
        }
        return new ArrayList<>(hMap.values());
    }
}
