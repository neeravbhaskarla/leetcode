class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b-a);
        
        for(int num: nums2) pq.add(num);
        
        int productSum = 0;
        for(int i = 0; i<nums1.length; i++) productSum+= nums1[i] * pq.poll();
        
        return productSum;
    }
}