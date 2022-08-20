class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() == needle.length()) return haystack.equals(needle)? 0: -1;
        if(haystack.length() < needle.length()) return -1;
        int resultIndex = -1;
        for(int index = 0; index<haystack.length(); index++){
            if(haystack.charAt(index) == needle.charAt(0)){
                if(needle.length()<2){
                    resultIndex = index;
                    break;
                }
                int haystackIter = index;
                int needleIter = 0;
                while(haystackIter<haystack.length() && needleIter<needle.length()){
                    if(haystack.charAt(haystackIter) != needle.charAt(needleIter)) break;
                    haystackIter++;
                    needleIter++;
                }
                if(needleIter == needle.length()){
                    resultIndex = index;
                    break;
                }
            }
        }
        return resultIndex;
    }
}