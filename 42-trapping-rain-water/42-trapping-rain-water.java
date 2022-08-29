class Solution {
    public int trap(int[] height) {
        int left_max = 0;
        int right_max = 0;
        int left = 0;
        int right = height.length - 1;
        int nums = 0;
        
        while(left<right){
            left_max = Math.max(left_max, height[left]);
            right_max = Math.max(right_max, height[right]);
            if(left_max<right_max){
                nums+= Math.max(0, left_max - height[left++]);
            }
            else{
                nums+= Math.max(0, right_max - height[right--]);
            }
        }
        
        return nums;
    }
}