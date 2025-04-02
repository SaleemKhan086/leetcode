class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        long max = 0;
        int maxIndex = n-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i+1]>max){
                max = nums[i+1];
                maxIndex = i+1;
            }
            arr[i] = maxIndex;
        }

        long maxVal = 0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                long val = nums[arr[j]]*(long)(nums[i]-nums[j]);
                maxVal = Math.max(val, maxVal);
            }
        }

        return maxVal;
    }
}