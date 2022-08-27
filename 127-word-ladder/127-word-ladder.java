class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        Set<String> words = new HashSet<>(wordList);
        
        words.remove(beginWord);
        queue.add(beginWord);
        int level = 0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            level++;
            for(int i=0; i< size; i++){
                String currentWord = queue.poll();
                if(currentWord.equals(endWord)) return level;
                List<String> neighbours = neighbours(currentWord);
                for(String neighbour: neighbours){
                    if(words.contains(neighbour)){
                        words.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }
        
        return 0;
    }
    private List<String> neighbours(String word){
        List<String> neighbourList = new ArrayList<>();
        char[] wordChar = word.toCharArray();
        for(int i=0; i<wordChar.length; i++){
            char temp = wordChar[i];
            for(char ch = 'a'; ch <='z'; ch++){
                wordChar[i] = ch;
                neighbourList.add(new String(wordChar));
            }
            wordChar[i] = temp;
        }
        return neighbourList;
    }
}