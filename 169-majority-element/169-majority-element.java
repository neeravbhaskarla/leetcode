class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: nums) freq.put(num, freq.getOrDefault(num, 0)+1);
        int maxCount = 0;
        int maxElement = 0;
        for(int num: nums){
            if(maxCount<freq.get(num)){
                maxCount = freq.get(num);
                maxElement = num;
            }
        }
        return maxElement;
    }
}