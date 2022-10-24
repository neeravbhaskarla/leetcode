class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] num1Count = new int[1000+1];
        int[] num2Count = new int[1000+1];
        
        for(int num: nums1){
            num1Count[num]++;
        }
        for(int num: nums2){
            num2Count[num]++;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<=1000; i++){
            while(num1Count[i] > 0 && num2Count[i] > 0){
                res.add(i);
                num1Count[i]--;
                num2Count[i]--;
            }
        }
        int[] result = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }
}