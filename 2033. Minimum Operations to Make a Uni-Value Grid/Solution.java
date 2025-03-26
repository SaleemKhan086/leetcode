class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;

        int[] arr = new int[m*n];
        int remainder = grid[0][0]%x;

        int idx = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[idx++] = grid[i][j];
                if(grid[i][j]%x != remainder){
                    return -1;
                }
            }
        }

        Arrays.sort(arr);
        int target = arr[arr.length/2];
        int count = 0;
        count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                count+= Math.abs(grid[i][j]-target)/x;
            }
        }

        return count;
    }
}
