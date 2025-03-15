class Solution {
    private boolean isPossible(int[] nums, int m, int k) {
        int count = 0;
        int prev = -2;
        for(int i=0;i<nums.length;i++){
            if(i==prev+1){
                continue;
            }
            if(nums[i]<=m){
                count++;
                prev = i;
            }
        }

        return count>=k;
    }

    public int minCapability(int[] nums, int k) {
        int n = nums.length;

        int min = nums[0];
        int max = nums[0];
        for(int i=0;i<n;i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int start = min;
        int end = max;
        int ans = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(isPossible(nums, mid, k)){
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return ans;
    }
}
