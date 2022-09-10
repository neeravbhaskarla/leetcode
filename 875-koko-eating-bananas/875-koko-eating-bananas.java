class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left =1, right =0;
        for(int i = 0; i<piles.length; i++){
            if(right<piles[i]){
                right = piles[i];
            }
        }
        
        while(left<=right){
            int mid = left+(right-left)/2;
            if(isPossible(piles, mid, h)){
                right = mid - 1;
            }
            else{
                left = mid +1;
            }
        }
        return left;
    }
    public boolean isPossible(int[] piles, int k, int h){
        int hourSpent = 0;
        for(int pile: piles){
            hourSpent+=Math.ceil((double)pile/k);
        }
        return hourSpent<=h;
    }
}