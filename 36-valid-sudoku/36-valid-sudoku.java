class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        Map<Integer, Set<Integer>> rows = new HashMap<>();
        Map<Integer, Set<Integer>> cols = new HashMap<>();
        Map<Integer, Set<Integer>> squares = new HashMap<>();
        
        for(int idx=0; idx<N; idx++){
            rows.put(idx, new HashSet<Integer>());
            cols.put(idx, new HashSet<Integer>());
            squares.put(idx, new HashSet<Integer>());
        }
        for(int row = 0; row<N; row++){
            for(int col = 0; col<N; col++){
                if(board[row][col]!='.'){
                    int val = board[row][col] - '0';
                    if(rows.get(row).contains(val) ||
                       cols.get(col).contains(val) ||
                       squares.get((row/3) * 3+col/3).contains(val))
                        return false;
                    rows.get(row).add(val);
                    cols.get(col).add(val);
                    squares.get((row/3) * 3 +col/3).add(val);
                }
            }
        }
        return true;
    }
}