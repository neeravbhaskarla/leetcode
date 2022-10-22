class Solution {
    public int strStr(String haystack, String needle) {
        int resultIndex = -1;
        for(int index = 0; index<haystack.length(); index++){
            if(haystack.charAt(index) == needle.charAt(0)){
                int haystackIndex = index;
                int needleIndex = 0;
                while(haystackIndex<haystack.length() && 
                      needleIndex<needle.length() && 
                      haystack.charAt(haystackIndex) == needle.charAt(needleIndex)
                     ){
                    haystackIndex++; needleIndex++;
                }
                if(needleIndex == needle.length()){
                    resultIndex = index;
                    break;
                }
            }
        }
        return resultIndex;
    }
}