class Solution {
    public String reverseWords(String s) {
        StringBuilder st = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0; i<words.length; i++){
            for(int j=words[i].length()-1; j>=0; j--){
                st.append(words[i].charAt(j));
            }
            if(i!=words.length-1)
                st.append(" ");
        }
        return st.toString();
    }
}