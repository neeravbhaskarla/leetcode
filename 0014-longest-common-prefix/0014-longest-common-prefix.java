class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        boolean flag = false;
        for(char ch: strs[0].toCharArray()){
            for(int i=1; i<strs.length; i++){
                if(index == strs[i].length() ||
                   ch != strs[i].charAt(index)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                sb.append(ch);
                index++;
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}