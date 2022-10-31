class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0; i<matrix[0].length-1; i++){
            int r = 0;
            int c = i;
            while(r+1<matrix.length && c+1<matrix[0].length){
                if(matrix[r][c]!=matrix[r+1][c+1]) return false;
                r++; c++;
            }
        }
        for(int i = 1; i<matrix.length-1; i++){
            int r = i;
            int c = 0;
            while(r+1<matrix.length && c+1<matrix[0].length){
                if(matrix[r][c]!=matrix[r+1][c+1]) return false;
                r++; c++;
            }
        }
        return true;
    }
}