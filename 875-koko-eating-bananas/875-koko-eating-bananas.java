class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left =1, right =1;
        for(int pile: piles){
            right = Math.max(right, pile);
        }
        
        while(left<right){
            int middle = (left+right)/2;
            if(isPossible(piles, middle, h)){
                right = middle;
            }
            else{
                left = middle+1;
            }
        }
        return right;
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