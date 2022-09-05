class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num: tasks)
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        int rounds = 0;
        for(int num: freqMap.keySet()){
            if(freqMap.get(num)<2) return -1;
            rounds+=(freqMap.get(num) + 2)/3;
        }
        return rounds;
    }
}