class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] maxLeft = new int[n];

        int mx = 0;
        for(int i=1;i<n;i++){
            mx = Math.max(mx, nums[i-1]);
            maxLeft[i] = mx;
        }

        mx = 0;
        long maxVal = 0;
        for(int i=n-2;i>=0;i--){
            mx = Math.max(mx, nums[i+1]);
            long val = (maxLeft[i]-nums[i])*(long)mx;
            maxVal = Math.max(val, maxVal);
        }

        return maxVal;
    }
}