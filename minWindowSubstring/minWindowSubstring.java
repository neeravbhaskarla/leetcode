class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> stringFreq = new HashMap();
        Map<Character, Integer> targetFreq = new HashMap();
        for(char ch: t.toCharArray()){
            targetFreq.put(ch, targetFreq.getOrDefault(ch, 0)+1);
            stringFreq.put(ch, 0);
        }
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int[] ans = {0, 0, 0};
        for(int right = 0; right<s.length(); right++){
            char r = s.charAt(right);
            if(targetFreq.containsKey(r)){
                stringFreq.put(r, stringFreq.get(r)+1);
                    while(compareIsValid(stringFreq, targetFreq)){
                        int window = right-left+1;
                        if(window<minLen){
                            minLen = window;
                            ans[0] = 1;
                            ans[1] = left;
                            ans[2] = right;
                        }
                        char l = s.charAt(left);
                        if(targetFreq.containsKey(l)){
                             stringFreq.put(l, stringFreq.get(l)-1);
                        }
                        left++;
                    }
                }
            }
        return s.substring(ans[1], ans[2]+ans[0]);
    }
    public boolean compareIsValid(Map<Character, Integer> stringMap, Map<Character, Integer> targetMap){
        for(char ch: targetMap.keySet()){
            if(!(stringMap.get(ch)>=targetMap.get(ch))){
                return false;
            }
        }
        return true;
    }
