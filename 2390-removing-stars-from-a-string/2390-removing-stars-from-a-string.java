class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int star = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '*') ++star;
            else if(star>0) --star;
            else sb.append(s.charAt(i));
        }
        return sb.reverse().toString();
    }
}