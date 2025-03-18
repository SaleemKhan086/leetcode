class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int N = 32;
        int ans = 1;
        for(int i=0;i<n;i++){
            int bits = 0;
            for(int j=0;j<N && (i+j<n);j++){
                int num = nums[i+j];
                boolean flag = (num&bits) == 0;
                if(flag){
                    bits = num|bits;
                    ans = Math.max(ans, j+1);
                } else {
                    break;
                }
            }
        }

        return ans;
    }
}
