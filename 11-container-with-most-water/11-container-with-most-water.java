class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while(left<right){
            int b = right-left;
            int l;
            if(height[left]<height[right]) l = height[left++];
            else l = height[right--];
            maxArea = Math.max(maxArea, l*b);
        }
        
        return maxArea;
    }
}