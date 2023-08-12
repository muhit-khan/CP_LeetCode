/*
 * [763] Partition Labels
 */

class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!hMap.containsKey(s.charAt(i))) {
                hMap.put(s.charAt(i), i);
            }
        }
        int lastIndex = -1;
        int startIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            lastIndex = Math.max(lastIndex, hMap.get(s.charAt(i)));
            if (i == lastIndex) {
                list.add(lastIndex - startIndex + 1);
                startIndex = lastIndex + 1;
            }
        }
        return list;
    }
}