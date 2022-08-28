class Solution {
    public String removeStars(String s) {
        char[] str = s.toCharArray();
        StringBuilder result = new StringBuilder();
        int i=0;
        while(i<str.length){
            if(str[i] == '*'){
                result.deleteCharAt(result.length()-1);
            }
            else{
                result.append(str[i]);
            }
            i++;
        }
        return result.toString();
    }
}