class Solution {
    private boolean canPartition(int[] nums, int curr, int sumSoFar, int sum, int [][]dp){
        int n = nums.length;
        if(curr==n){
            return sumSoFar==sum/2;
        }

        if(dp[curr][sumSoFar]!=-1){
            return dp[curr][sumSoFar]==1;
        }

        boolean ans = canPartition(nums,curr+1, sumSoFar, sum, dp) ||
            canPartition(nums, curr+1, sumSoFar+nums[curr], sum, dp);
            
        dp[curr][sumSoFar] = ans?1:0;
        return dp[curr][sumSoFar]==1;
    }

    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i=0;i<n;i++){
            sum+= nums[i];
        }

        if(sum%2 != 0){
            return false;
        }

        int dp[][] = new int[n][sum+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j] = -1;
            }
        }

        return canPartition(nums, 0, 0, sum, dp);
    }
}
