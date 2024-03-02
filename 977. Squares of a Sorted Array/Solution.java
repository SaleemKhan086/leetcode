class Solution {
    int firstNonNeg(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                return i;
            }
        }
        return nums.length;
    }
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int j = firstNonNeg(nums);
        int i = j-1;
        int[] ans = new int[n];
        int k = 0;
        while(i>=0 && j<n) {
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                ans[k] = nums[i]*nums[i];
                i--;
            }
            else{
                ans[k] = nums[j]*nums[j];
                j++;
            }
            k++;
        }

        while(i>=0) {
            ans[k++] = nums[i]*nums[i];
            i--;
        }
        while(j<n) {
            ans[k++] = nums[j]*nums[j];
            j++;
        }

        return ans;
    }
}
