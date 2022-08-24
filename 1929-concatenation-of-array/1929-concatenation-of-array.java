class Solution {
    public int[] getConcatenation(int[] nums) {
        int arrSize = nums.length;
        int concatArrSize = 2 * arrSize;
        int[] result = new int[concatArrSize];
        for(int i=0; i<arrSize; i++){
            result[i] = nums[i];
            result[arrSize+i] = nums[i];
        }
        return result;
    }
}