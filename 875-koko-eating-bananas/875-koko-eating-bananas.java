class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left =1, right = Arrays.stream(piles).max().getAsInt();
        
        while(left<right){
            int middle = (left+right)/2;
            int hourSpent = 0;
            for(int pile: piles) hourSpent+=Math.ceil((double)pile/middle);
            if(hourSpent<=h) right = middle;
            else left = middle+1;
        }
        return right;
    }
}