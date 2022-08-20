class Solution {
    public class Trie{
        class Node{
            boolean isWord = false;
            List<Node> children = Arrays.asList(new Node[26]);
        }
        
        Node Root;
        List<String> resultBuffer;
        
        void dfsWithPrefix(Node curr, String word){
            if(resultBuffer.size() == 3) return;
            if(curr.isWord) resultBuffer.add(word);
            
            for(char c = 'a'; c<='z'; c++)
                if(curr.children.get(c - 'a') != null)
                    dfsWithPrefix(curr.children.get(c-'a'), word+c);
        }
        
        Trie(){
            Root = new Node();
        }
        
        void insert(String prefix){
            Node curr = Root;
            resultBuffer = new ArrayList<String>();
            
            for(char c: prefix.toCharArray()){
                if(curr.children.get(c-'a') == null) curr.children.set(c-'a', new Node());
                curr = curr.children.get(c-'a');
            }
            
            curr.isWord = true;
            
        }
        
        List<String> getWordStartingWith(String prefix){
            Node curr = Root;
            resultBuffer = new ArrayList<String>();
        
            for(char c: prefix.toCharArray()){
                if(curr.children.get(c - 'a') == null)
                    return resultBuffer;
                curr = curr.children.get(c - 'a');
            }
            
            dfsWithPrefix(curr, prefix);
            return resultBuffer;
        }
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie trie = new Trie();
        List<List<String>> result = new ArrayList<>();
        
        for(String product: products) trie.insert(product);
        
        String prefix = new String();
        for(char c: searchWord.toCharArray()){
            prefix+=c;
            result.add(trie.getWordStartingWith(prefix));
        }
        
        return result;
    }
}