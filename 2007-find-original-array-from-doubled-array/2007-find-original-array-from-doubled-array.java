class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2 == 1){
            return new int[0];
        }
        
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: changed){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int index = 0;
        Arrays.sort(changed);
        int[] result = new int[changed.length / 2];
        for(int num: changed){
            if(freq.get(num)>0){
                int twice = num*2;
                if(freq.containsKey(twice) && freq.get(twice)>0){
                    result[index++] = num;
                    freq.put(twice, freq.get(twice) - 1);
                }
                else{
                    return new int[0];
                }
                freq.put(num, freq.get(num) - 1);
            }
        }
        return result;
    }
}