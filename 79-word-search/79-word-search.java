class Solution {
    private char[][] BOARD;
    private String WORD;
    private int ROWS, COLS;
    public boolean exist(char[][] board, String word) {
        this.WORD = word;
        this.BOARD = board;
        this.ROWS = board.length;
        this.COLS = board[0].length;
        for(int row = 0; row<this.ROWS; row++)
            for(int col = 0; col<this.COLS; col++)
                if(dfs(row, col, 0))
                    return true;
        return false;
    }
    
    public boolean dfs(int row, int col, int index){
        if(index == WORD.length()) 
            return true;
        if(row<0 || col<0 || row>=this.ROWS || col>=this.COLS || WORD.charAt(index)=='#' || WORD.charAt(index)!=BOARD[row][col])
            return false;
        boolean ret = false;
        BOARD[row][col] = '#';
        if(dfs(row+1, col, index+1) || dfs(row, col+1, index+1) || dfs(row-1, col, index+1) || dfs(row, col-1, index+1)) 
            ret = true;
        BOARD[row][col] = WORD.charAt(index);
        return ret;
    }
}