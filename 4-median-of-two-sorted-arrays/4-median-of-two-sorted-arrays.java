class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = 0, r = 0;
        int m = nums1.length, n = nums2.length;
        int[] merged = new int[m+n];
        int k = 0;
        while(l<m && r<n){
            if(nums1[l]<nums2[r]){
                merged[k] = nums1[l];
                l++; k++;
            }
            else{
                merged[k] = nums2[r];
                r++; k++;
            }
        }
        while(l<nums1.length){
            merged[k] = nums1[l];
            k++; l++;
        }
        while(r<nums2.length){
            merged[k] = nums2[r];
            k++; r++;
        }
        return (m+n)%2 == 1 ? merged[(m+n)/2]: 0.5*(merged[(m+n)/2] + merged[(m+n)/2 - 1]);
    }
}