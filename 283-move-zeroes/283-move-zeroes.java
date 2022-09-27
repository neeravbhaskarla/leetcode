class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num: nums){
            if(num != 0)
                arr.add(num);
        }
        int i;
        for(i=0; i<arr.size(); i++){
            nums[i] = arr.get(i);
        }
        if(i<nums.length){
            for(; i<nums.length; i++){
                nums[i] = 0;
            }
        }
    }
}