class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxCount = 0;
        for(String sentence: sentences) maxCount = Math.max(maxCount, sentence.split(" ").length);
        return maxCount;
    }
}