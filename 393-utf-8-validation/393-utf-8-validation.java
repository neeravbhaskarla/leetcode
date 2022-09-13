class Solution {
    public boolean validUtf8(int[] data) {
        int mask1 = 1<<7;
        int mask2 = 1<<6;
        int numOfDigits = 0;
        for(int i=0; i<data.length; i++){
            if(numOfDigits == 0){
                int mask = 1<<7;
                while((mask&data[i])!=0){
                    numOfDigits++;
                    mask = mask>>1;
                }
                
                if(numOfDigits == 0){
                    continue;
                }
                
                if(numOfDigits > 4 || numOfDigits == 1){
                    return false;
                }
            }
            
            else{
                if(!((mask1&data[i])!=0 && (mask2&data[i]) == 0)){
                    return false;
                }
            }
            numOfDigits--;
        }
        return numOfDigits == 0;
    }
}