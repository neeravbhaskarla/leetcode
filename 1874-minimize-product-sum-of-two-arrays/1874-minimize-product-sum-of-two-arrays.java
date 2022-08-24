class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {
        int[] counter1 = new int[101];
        int[] counter2 = new int[101];
        
        for(int num: nums1) counter1[num]++;
        for(int num: nums2) counter2[num]++;
        
        int p1 = 0;
        int p2 = 100;
        int productSum = 0;
        
        while(p1<101 && p2>0){
            
            while(p1<101 && counter1[p1] == 0) p1+=1;
            while(p2>0 && counter2[p2] == 0) p2-=1;
            
            if(p1 == 101 || p2 == 0) break;
            
            int occ = Math.min(counter1[p1], counter2[p2]);
            productSum += occ * p1 *p2;
            counter1[p1]-=occ;
            counter2[p2]-=occ;
        }
        
        return productSum;
    }
}