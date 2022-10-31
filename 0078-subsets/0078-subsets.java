class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num: nums){
            List<List<Integer>> currDup = new ArrayList<>();
            for(List<Integer> iterRes: result){
                currDup.add(new ArrayList<>(iterRes){{add(num);}});
            }
            for(List<Integer> curr: currDup){
                result.add(curr);
            }
        }
        return result;
    }
}