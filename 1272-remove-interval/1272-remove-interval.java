class Solution {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        List<List<Integer>> result = new ArrayList<>();
        int start = toBeRemoved[0], end = toBeRemoved[1];
        for(int[] interval: intervals){
            if(interval[1]<=start || interval[0]>=end){
                result.add(List.of(interval[0], interval[1]));
            }
            else{
                if(interval[0]<start) 
                    result.add(List.of(interval[0], start));
                if(interval[1]>end) 
                    result.add(List.of(end, interval[1]));
            }
        }
        return result;
    }
}