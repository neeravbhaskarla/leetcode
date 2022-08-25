class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] firstPart = Arrays.copyOfRange(nums, 0, n);
        int[] secondPart = Arrays.copyOfRange(nums, n, n*2);
        int first = 0;
        int second = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                nums[i] = firstPart[first++];
            }
            else{
                nums[i] = secondPart[second++];
            }
        }
        return nums;
    }
}