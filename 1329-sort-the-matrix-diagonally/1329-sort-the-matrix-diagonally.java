class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int iter = 0;
        int iterInc = 0;
        PriorityQueue<Integer> sorted;
        for(int i=0; i<Math.max(row, col); i++){
            
            iter =0;
            sorted = new PriorityQueue<>();
            for(int j=i; j<col && iter<row; j++){
                sorted.add(mat[iter++][j]);
            }
            
            iter = 0;
            for(int j=i; j<col && iter<row; j++){
                mat[iter++][j] = sorted.poll();
            }
            
            iter =0;
            sorted = new PriorityQueue<>();
            for(int j=i; j<row && iter<col; j++){
                sorted.add(mat[j][iter++]);
            }
            
            iter = 0;
            for(int j=i; j<row && iter<col; j++){
                mat[j][iter++] = sorted.poll();
            }
        }
        
        return mat;
    }
}