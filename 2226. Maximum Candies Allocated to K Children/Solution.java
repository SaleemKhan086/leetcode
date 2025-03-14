class Solution {
    // candies = array of piles of candies
    // c = candies each kid will get
    // k = no. of kids
    private boolean canDistribute(int[] candies, int c, long k) {
        long count = 0;
        for(int i=0;i<candies.length;i++){
            count+= candies[i]/c;
        }
        return count>=k;
    }
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        int max = candies[0];

        // find the max in candies
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }

        // run binary search to find optimal no. of candies that can be distributed.
        int start = 1;
        int end = max;
        int ans = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(canDistribute(candies, mid, k)){
                ans = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return ans;
    }
}