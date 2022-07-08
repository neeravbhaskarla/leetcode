class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maxarea = Integer.MIN_VALUE;
        while(low<high){
            int h = Math.min(height[low], height[high]);
            int w = high-low;
            maxarea = Math.max(maxarea, h*w);
            if(height[low]<height[high]) low++;
            else high--;
        }
        return maxarea;
    }
