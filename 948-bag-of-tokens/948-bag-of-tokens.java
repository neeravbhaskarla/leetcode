class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int low = 0, high = tokens.length-1;
        int score = 0, points = 0;
        while(low<=high){
            if(P>=tokens[low]){
                P-=tokens[low];
                score++;
                low++;
            }
            else if(score>0 && low<high){
                P+=tokens[high];
                score--;
                high--;
            }
            else{
                break;
            }
        }
        return score;
    }
}