class Solution {
    public int findMin(int[] nums) {
        
        // If nums array consists of only one number, then mininum can be only that number.
        if(nums.length == 1){
            return nums[0];
        }
        int start = 0;
        int end = nums.length-1;
        
        // If last element is greater than first element array is not sorted and not rotated.
        if(nums[end]>nums[0]){
            return nums[0];
        }
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            // If right most element of mid is less, we are at pivot hence the right element is smallest. 
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            
            // If left most element is greater then the mid is the smallest element i.e pivot.
            else if(nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            
            // If mid is greater than first element then smallest element lies on right side
            if(nums[mid]>nums[0]){
                start = mid+1;
            }
            // if mid is small then smallest element lies on left side.
            else{
                end = mid - 1;
            }
            
        }
        return -1;
    }
