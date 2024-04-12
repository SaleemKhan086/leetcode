class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        
        int mx = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = mx;
            mx = Math.max(mx, height[i]);
        }

        int ans = 0;
        mx = height[n-1];
        for(int i=n-2;i>=1;i--){
            int water = Math.min(leftMax[i], mx)-height[i];
            if(water>0){
                ans+= water;
            }
            mx = Math.max(mx, height[i]);
        }

        return ans;
    }
}
