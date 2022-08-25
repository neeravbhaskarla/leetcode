class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;    
        for(int[] customerAccount: accounts)
            max = Math.max(max, Arrays.stream(customerAccount).sum());
        return max;
    }
}