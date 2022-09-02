class Solution {
    int[] DIST = {0, 1, 0, -1, 0};
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        Queue<int[]> queue = new ArrayDeque();
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                if(mat[row][col] == 0) queue.add(new int[]{row, col});
                else mat[row][col] = -1;
            }
        }
        while(!queue.isEmpty()){
            int[] val = queue.remove();
            int r = val[0], c = val[1];
            for(int i=0; i<4; i++){
                int nr = r+DIST[i], nc = c+DIST[i+1];
                if(nr<0 || nc<0 || nr>=rows || nc>=cols || mat[nr][nc]!=-1) continue;
                mat[nr][nc] = mat[r][c]+1;
                queue.add(new int[]{nr, nc});
            }
        }
        
        return mat;
    }
}