class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2 == 1) return new int[0];
        
        int maxValue = 0;
        for(int num: changed){
            maxValue = Math.max(maxValue, num);
        }
        int[] freq = new int[2*maxValue + 1];
        
        Arrays.fill(freq, 0);
        
        for(int num: changed){
            freq[num]++;
        }
        int index = 0;
        int[] result = new int[changed.length/2];
        for(int num = 0; num<freq.length; num++){
            if(freq[num]>0){
                int val = num;
                int twice = val*2;
                if(freq[twice]>0){
                    freq[num]--;
                    result[index++] = val;
                    freq[twice]--; 
                    num--;
                }
                else{
                    return new int[0];
                }
            }
        }
        return result;
    }
}