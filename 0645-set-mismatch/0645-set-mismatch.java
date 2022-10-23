class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) map.put(num, map.getOrDefault(num, 0)+1);
        for(int num: nums){
            if(map.get(num)==2){
                res[0] = num;
            }
        }
        int sum = 0;
        for(int num: map.keySet()){
            sum+=num;
        }
        res[1] = ((nums.length*(nums.length+1))/2) - sum;
        return res;
    }
}