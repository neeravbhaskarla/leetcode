class Solution {
    public boolean checkIfPangram(String sentence) {
        int charBits = 0;
        for(char ch: sentence.toCharArray())
            charBits|=(1<<(ch-'a'));
        return (charBits&67108863)==67108863;
    }
}