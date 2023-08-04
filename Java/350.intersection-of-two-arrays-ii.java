/*
 * [350] Intersection of Two Arrays II
 */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>();
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        
        for (int num : nums1) {
            hm1.put(num, hm1.getOrDefault(num, 0)+1);
        }
        for (int num : nums2) {
            hm2.put(num, hm2.getOrDefault(num, 0)+1);
        }
        for (Map.Entry<Integer, Integer> e : hm1.entrySet()) {
            if (hm2.containsKey(e.getKey())){
                int freq = Math.min(hm1.get(e.getKey()), hm2.get(e.getKey()));
                for (int i = 0; i < freq; i++) {
                    intersection.add(e.getKey());
                }
            }
        }
        int[] result = intersection.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
