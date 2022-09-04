class Solution {
    List<String> combinations = new ArrayList<>();
    private Map<Character, String> letters = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl", 
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    private String numDigits;
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return combinations;
        numDigits = digits;
        dfs(0, new StringBuilder());
        return combinations;
    }
    public void dfs(int index, StringBuilder path){
        if(numDigits.length() == path.length()){
            combinations.add(path.toString());
            return;
        }
        
        String pattern = letters.get(numDigits.charAt(index));
        for(Character ch: pattern.toCharArray()){
            path.append(ch);
            dfs(index+1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}