/*
 * [290] Word Pattern
 */

import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        }
        HashMap<Character, String> hMap = new HashMap<Character, String>();
        for (int i = 0; i < pattern.length(); i++) {
            if (hMap.containsValue(arr[i]) && !hMap.containsKey(pattern.charAt(i))) {
                return false;
            }
            if (hMap.containsKey(pattern.charAt(i)) && !hMap.get(pattern.charAt(i)).equals(arr[i])){
                return false;
            }
            else{
                hMap.put(pattern.charAt(i), arr[i]);
            }
        }
        return true;
    }
}
