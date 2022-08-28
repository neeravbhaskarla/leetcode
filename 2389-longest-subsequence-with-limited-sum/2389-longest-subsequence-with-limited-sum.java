class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++) nums[i] = nums[i-1]+nums[i];
        for(int i=0; i<queries.length; i++){
            queries[i] = binarySearch(nums, queries[i]);
        }
        return queries;
    }
    public int binarySearch(int[] nums, int find){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid] == find) return mid+1;
            else if(nums[mid]<find) left = mid+1;
            else right = mid-1;
        }
        return nums[left]>find?left: left+1;
    }
}