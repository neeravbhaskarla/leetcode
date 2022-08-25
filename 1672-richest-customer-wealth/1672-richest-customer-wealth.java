class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;   
        for(int[] customerAccount: accounts){
            int currentWealth=0;
            for(int i=0; i<customerAccount.length; i++){
                currentWealth+=customerAccount[i];
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }
}