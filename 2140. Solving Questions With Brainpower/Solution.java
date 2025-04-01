class Solution {
    private long calculatePoints(int[][] questions, int curr, long[] dp){
        int n = questions.length;
        if(curr>=n){
            return 0;
        }
        if(dp[curr]!=0){
            return dp[curr];
        }
        long ptsWithCurr = questions[curr][0] + 
            calculatePoints(questions, curr+questions[curr][1]+1, dp);
        long ptsWithoutCurr = calculatePoints(questions, curr+1, dp);

        dp[curr] = Math.max(ptsWithCurr, ptsWithoutCurr);
        return dp[curr];
    }
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length];
        return calculatePoints(questions, 0, dp);
    }
}