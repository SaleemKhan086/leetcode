class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int parameter = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(i==0 || grid[i-1][j]==0){
                        parameter++;
                    }
                    if(j==0 || grid[i][j-1]==0){
                        parameter++;
                    }
                    if(i==n-1 || grid[i+1][j]==0){
                        parameter++;
                    }
                    if(j==m-1 || grid[i][j+1]==0){
                        parameter++;
                    }
                }
            }
        }

        return parameter;
    }
}
