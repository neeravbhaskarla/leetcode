class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int low = 0, high = tokens.length-1;
        int ans = 0, points = 0;
        while(low<=high && (P>=tokens[low] || points>0)){
            while(low<=high && P>=tokens[low]){
                P-=tokens[low++];
                points++;
            }
            ans = Math.max(ans, points);
            if(low<=high && points>0){
                P+=tokens[high--];
                points--;
            }
        }
        return ans;
    }
}