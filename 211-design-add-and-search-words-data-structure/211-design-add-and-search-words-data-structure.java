class WordDictionary {
    WordDictionary[] children;
    boolean isEnd;
    public WordDictionary() {
        children = new WordDictionary[26];
        isEnd = false;
    }
    
    public void addWord(String word) {
        WordDictionary pCrawl = this;
        for(int level = 0; level<word.length(); level++){
            int index = word.charAt(level) - 'a';
            if(pCrawl.children[index]==null) pCrawl.children[index] = new WordDictionary();
            pCrawl = pCrawl.children[index];
        }
        pCrawl.isEnd = true;
    }
    
    public boolean search(String word) {
        WordDictionary pCrawl = this;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == '.'){
                for(WordDictionary ch: pCrawl.children)
                    if(ch!=null && ch.search(word.substring(i+1))) return true;
                return false;
            }
            int index = word.charAt(i) - 'a';
            if(pCrawl.children[index]==null) return false;
            pCrawl = pCrawl.children[index];
        }
        return pCrawl.isEnd;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */