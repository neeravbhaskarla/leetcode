class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String normalizedString = paragraph.replaceAll("[^a-zA-z0-9]", " ").toLowerCase();
        String[] words = normalizedString.split("\\s+");
        
        Set<String> bannedWords = new HashSet();
        for(String word: banned){
            bannedWords.add(word);
        }
        Map<String, Integer> map = new HashMap<>();
        for(String word: words){
            if(!bannedWords.contains(word))
                map.put(word, map.getOrDefault(word, 0)+1);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}