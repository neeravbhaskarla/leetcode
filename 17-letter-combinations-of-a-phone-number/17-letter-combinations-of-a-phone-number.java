class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        Map<Integer, List<String>> numpad = new HashMap<>();
        
        numpad.put(1, new ArrayList<>());
        numpad.put(2, Arrays.asList("a", "b", "c"));
        numpad.put(3, Arrays.asList("d", "e", "f"));
        numpad.put(4, Arrays.asList("g", "h", "i"));
        numpad.put(5, Arrays.asList("j", "k", "l"));
        numpad.put(6, Arrays.asList("m", "n", "o"));
        numpad.put(7, Arrays.asList("p", "q", "r", "s"));
        numpad.put(8, Arrays.asList("t", "u", "v"));
        numpad.put(9, Arrays.asList("w", "x", "y", "z"));
        
        List<String> result = new ArrayList<>();
        for(String ch: numpad.get(digits.charAt(0) - '0')) result.add(ch);
        for(int i=1; i<digits.length(); i++){
                int resultLen = result.size();
                for(String ch: numpad.get(digits.charAt(i) - '0')){
                    for(int j=0; j<resultLen; j++){
                        String st = "";
                        st+=result.get(j)+ch;
                        result.add(st);
                    }
                }
        }
        if(digits.length() == 1) return result;
        List<String> perfectResult = new ArrayList<>();
        for(int i=0; i<result.size(); i++) if(result.get(i).length() == digits.length()) perfectResult.add(result.get(i));
        return perfectResult;
    }
}