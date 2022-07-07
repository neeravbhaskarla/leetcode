class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueNums = new HashSet();
        for(int num: nums) uniqueNums.add(num);
        int longestSequence = 0;
        for(int num: uniqueNums){
            if(!uniqueNums.contains(num-1)){
                int currNum = num;
                int currSeq = 1;
                while(uniqueNums.contains(currNum+1)){
                    currNum++;
                    currSeq++;
                }
                longestSequence = Math.max(longestSequence, currSeq);
            }
        }
        return longestSequence;
    }
