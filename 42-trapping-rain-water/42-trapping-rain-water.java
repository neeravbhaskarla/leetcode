class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 0;
        right[n-1] = 0;
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], height[i-1]);
            right[n-i-1] = Math.max(right[n-i], height[n-i]);
        }
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            trappedWater += Math.max(0, Math.min(left[i], right[i]) - height[i]);
        }
        return trappedWater;
    }
}