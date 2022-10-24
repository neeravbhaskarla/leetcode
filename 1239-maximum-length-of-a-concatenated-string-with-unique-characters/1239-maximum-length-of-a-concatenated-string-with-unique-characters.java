class Solution {
    public int maxLength(List<String> arr) {
        List<String> sub = new ArrayList<>();
        sub.add("");
        int maxLen = 0;
        for(String word: arr){
            int subStringLen = sub.size();
            for(int i = 0; i<subStringLen; i++){
                String newRes = sub.get(i) + word;
                int charBit = 0;
                boolean flag = false;
                for(char ch: newRes.toCharArray()){
                    int mask = (1<<(ch-'a'))&charBit;
                    if( mask > 0) flag = true; 
                    charBit|=(1<<(ch - 'a'));
                }
                if(flag) continue;
                sub.add(newRes);
                maxLen = Math.max(maxLen, newRes.length());
            }
        }
        return maxLen;
    }
}