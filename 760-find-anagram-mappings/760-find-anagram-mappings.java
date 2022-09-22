class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<nums2.length; i++){
            hash.put(nums2[i], i);
        }
        int[] result = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            result[i] = hash.get(nums1[i]);
        }
        return result;
    }
}