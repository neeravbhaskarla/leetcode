class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            int count = 0;
            int j = 0;
            for(j=i+1; j<temperatures.length; j++, count++){
                if(temperatures[j]>temperatures[i]){
                    count++;
                    break;
                }
            }
            if(j == temperatures.length){
                result[i] = 0;
            }
            else{
                result[i] = count;   
            }
        }
        return result;
    }
}