class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] diff = new int[rows][cols];

        for(int i=0;i<rows;i++) {
            int val = 0;
            for(int j=0;j<cols;j++) {
                if(grid[i][j]==1){
                    val++;
                }
                else if(grid[i][j]==0){
                    val--;
                }
            }
            for(int j=0;j<cols;j++) {
                diff[i][j] = val;
            }
        }

        for(int j=0;j<cols;j++) {
            int val = 0;
            for(int i=0;i<rows;i++) {
                if(grid[i][j]==1){
                    val++;
                }
                else if(grid[i][j]==0){
                    val--;
                }
            }
            for(int i=0;i<rows;i++) {
                diff[i][j] += val;
            }
        }

        return diff;
    }
}
