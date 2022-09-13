class Solution {
    public boolean validUtf8(int[] data) {
        int mask1 = 1<<7;
        int mask2 = 1<<6;
        int numberOfBytes = 0;
        for(int i=0; i<data.length; i++){
            if(numberOfBytes == 0){
                if(data[i]>255) return false; 
                if((data[i] & 128) == 0) {
                    numberOfBytes = 1;
                } else if((data[i] & 224) == 192) {
                    numberOfBytes = 2;
                } else if((data[i] & 240) == 224) {
                    numberOfBytes = 3;
                } else if((data[i] & 248) == 240) {
                    numberOfBytes = 4;
                } else {
                    return false;
                }
                if(numberOfBytes == 0) continue;
            }
            
            else{
                if(!((mask1&data[i])!=0 && (mask2&data[i]) == 0)){
                    return false;
                }
            }
            numberOfBytes--;
        }
        return numberOfBytes == 0;
    }
}