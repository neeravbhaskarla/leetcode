class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxCount = 0;
        for(String sentence: sentences){
            int currentCount = 0;
            for(String word: sentence.split(" ")){
                currentCount++;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }
}