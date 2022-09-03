class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        if(n == 0){
            return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        
        List<Integer> queue = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for(int i=1; i<n; i++){
            List<Integer> newQueue = new ArrayList<>();
            for(int digit: queue){
                int tailNode = digit%10;
                List<Integer> possibleDigit = new ArrayList<>();
                possibleDigit.add(tailNode+k);
                if(k!=0)
                    possibleDigit.add(tailNode-k);
                for(int currDigit: possibleDigit){
                    if(currDigit>=0 && currDigit<=9){
                        int num = digit * 10 + currDigit;
                        newQueue.add(num);
                    }
                }
            }
            queue = newQueue;
        }
        return queue.stream().mapToInt(i->i).toArray();
    }
}