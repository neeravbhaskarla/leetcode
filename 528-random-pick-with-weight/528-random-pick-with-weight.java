class Solution {
    private int[] prefixSums;
    private int totalSum;
    
    public Solution(int[] w) {
        this.prefixSums = new int[w.length];
        int prefixSum = 0;
        for(int i=0; i<w.length; ++i){
            prefixSum += w[i];
            this.prefixSums[i] = prefixSum;
        }
        this.totalSum = prefixSum;
    }
    
    public int pickIndex() {
        double target = this.totalSum * Math.random();
        
        int j = 0;
        for(; j<this.prefixSums.length; j++){
            if(target < this.prefixSums[j])
                return j;
        }
        
        return j-1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */