class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                if(board[r][c] == '.') continue;
                String s = "(" +board[r][c]+ ")";
                if(!seen.add(r + s) || !seen.add(s + c) || !seen.add(r/3 + s + c/3))
                    return false;
            }
        }
        return true;
    }
}