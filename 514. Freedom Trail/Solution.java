class Solution {
    private int minDist(int s, int d, int n){
        if(d>s){
            return Math.min(d-s, n-d+s);
        }
        else {
            return Math.min(s-d, n-s+d);
        }
    }

    private int minSteps(String ring, String key, int i, int selected, int[][] dp){
        if(i>=key.length()){
            return 0;
        }

        if(dp[i][selected]!=Integer.MAX_VALUE){
            return dp[i][selected];
        }

        int min = Integer.MAX_VALUE;
        for(int j=0;j<ring.length();j++){
            if(ring.charAt(j)==key.charAt(i)){
                int steps = minDist(selected, j, ring.length());
                steps+= 1;
                steps+= minSteps(ring, key, i+1, j, dp);
                min = Math.min(min, steps);
            }
        }

        dp[i][selected] = min;
        return min;
    }
    public int findRotateSteps(String ring, String key) {
        int dp[][] = new int[key.length()][ring.length()];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        return minSteps(ring, key, 0, 0, dp);
    }
}
