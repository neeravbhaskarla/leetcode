class Solution {
    public String reverseWords(String s) {
        int lastSpacedIndex = -1;
        char[] chArray = s.toCharArray();
        int len = s.length();
        for(int strIndex = 0; strIndex<=len; strIndex++){
            if(strIndex == len || chArray[strIndex] == ' '){
                int startIndex = lastSpacedIndex + 1;
                int endIndex = strIndex - 1;
                while(startIndex<endIndex){
                    char temp = chArray[startIndex];
                    chArray[startIndex] = chArray[endIndex];
                    chArray[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
                lastSpacedIndex = strIndex;
            }
        }
        return new String(chArray);
    }
}