class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int maxAttack = 0;
        
        for (int[] property : properties) {
            int attack = property[0];
            maxAttack = Math.max(maxAttack, attack);
        }
        
        int maxDefense[] = new int[maxAttack + 2];
        for (int[] property : properties) {
            int attack = property[0];
            int defense = property[1];
            
            maxDefense[attack] = Math.max(maxDefense[attack], defense);
        }

        for (int i = maxAttack - 1; i >= 0; i--) {
            maxDefense[i] = Math.max(maxDefense[i], maxDefense[i + 1]);
        }
        
        int weakCharacters = 0;
        for (int[] property : properties) {
            int attack = property[0];
            int defense = property[1];
            
            if (defense < maxDefense[attack + 1]) {
                weakCharacters++;
            }
        }
        
        return weakCharacters;
    }
}