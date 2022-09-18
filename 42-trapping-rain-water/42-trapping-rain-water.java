class Solution {
    public int trap(int[] height) {
        int left_max = 0;
        int right_max = 0;
        int left = 0;
        int right = height.length - 1;
        int water = 0;
        
        while(left<right){
            left_max = Math.max(left_max, height[left]);
            right_max = Math.max(right_max, height[right]);
            if(left_max<right_max){
                water += Math.max(0, left_max - height[left++]);
            }
            else{
                water += Math.max(0, right_max - height[right--]);
            }
        }
        return water;
    }
}