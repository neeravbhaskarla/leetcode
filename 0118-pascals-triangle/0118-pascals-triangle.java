class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        res.add(1);
        result.add(new ArrayList<>(res));
        if(numRows == 1){
            return result;
        }
        res.add(1);
        result.add(new ArrayList<>(res));
        if(numRows == 2){
            return result;
        }
        for(int i = 3; i<=numRows; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=0; j<res.size()-1; j++){
                temp.add(res.get(j)+res.get(j+1));
            }
            temp.add(1);
            result.add(new ArrayList<>(temp));
            res = new ArrayList<>(temp);
        }
        return result;
    }
}