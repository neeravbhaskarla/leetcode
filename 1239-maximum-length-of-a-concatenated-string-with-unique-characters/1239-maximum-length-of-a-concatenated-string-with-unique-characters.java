class Solution {
    public int maxLength(List<String> arr) {
        List<String> sub = new ArrayList<>();
        sub.add("");
        int maxLen = 0;
        for(String word: arr){
            int subStringLen = sub.size();
            for(int i = 0; i<subStringLen; i++){
                String newRes = sub.get(i) + word;
                Set<Character> newResSet = new HashSet<>();
                for(char ch: newRes.toCharArray()){
                    newResSet.add(ch);
                }
                if(newResSet.size()!=newRes.length()) continue;
                sub.add(newRes);
                maxLen = Math.max(maxLen, newRes.length());
            }
        }
        return maxLen;
    }
}