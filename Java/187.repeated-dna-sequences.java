/*
 * [187] Repeated DNA Sequences
 */

import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i <= s.length() - 10; i++) {
            String dna = s.substring(i, i + 10);
            hMap.put(dna, hMap.getOrDefault(dna, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : hMap.entrySet()) {
            if (entry.getValue()>1) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}