class Solution {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        List<List<Integer>> res = new ArrayList<>();
        for(int[] cur : intervals) {
            if(toBeRemoved == null || cur[1] <= toBeRemoved[0]) {
                res.add(List.of(cur[0], cur[1])); 
            } else if(cur[0] >= toBeRemoved[1]) {
                toBeRemoved = null;
                res.add(List.of(cur[0], cur[1]));
            } else {
                if(cur[0] < toBeRemoved[0]) {
                    res.add(List.of(cur[0], toBeRemoved[0]));
                }
                if(cur[1] > toBeRemoved[1]) {
                    res.add(List.of(toBeRemoved[1], cur[1]));
                }
            }
        }
        return res;
    }
}