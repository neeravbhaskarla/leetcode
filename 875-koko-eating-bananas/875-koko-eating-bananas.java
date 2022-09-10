class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left =1, right =0;
        for(int pile: piles){
            right = Math.max(right, pile);
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
    public boolean isPossible(int[] piles, int middle, int h){
        int hourSpent = 0;
        for(int pile: piles){
            hourSpent+=Math.ceil((double)pile/middle);
            if(hourSpent>h) return false;
        }
        return true;
    }
}