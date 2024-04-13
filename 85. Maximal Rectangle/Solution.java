class Solution {
    public int maximalRectangle(char[][] matrix) {
        int [][] dp = new int[matrix.length][matrix[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j] = matrix[i][j]=='1'?1:0;
            }
        }

        for(int r=0;r<dp.length;r++){
            int count = 0;
            for(int c=0;c<dp[r].length;c++){
                if(dp[r][c]==1){
                    count++;
                }
                else{
                    int i = c-1;
                    int cnt=1;
                    while(cnt<=count){
                        dp[r][i] = cnt++;
                        i--;
                    }
                    count = 0;
                }
            }
            if(count>0){
                int i = dp[r].length-1;
                int cnt=1;
                while(cnt<=count){
                    dp[r][i] = cnt++;
                    i--;
                }
            }
        }

        int ans = 0;
        for(int c=0;c<dp[0].length;c++){
            for(int s=0;s<dp.length;s++){
                int mn = dp[s][c];
                for(int e=s;e<dp.length;e++){
                    mn = Math.min(mn, dp[e][c]);
                    int area = mn*(e-s+1);
                    ans = Math.max(ans, area);
                }
            }
        }

        return ans;
    }
}
