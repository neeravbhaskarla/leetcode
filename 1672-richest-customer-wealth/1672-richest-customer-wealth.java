class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;    
        for(int[] customerAccount: accounts)
            max = Math.max(max, Arrays.stream(customerAccount).sum());
        return max;
    }
}