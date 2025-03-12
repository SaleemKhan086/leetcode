class Solution {
    private void print(int n){
        System.out.println(n);
    }
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        int firstPositive = n;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>0){
                firstPositive = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        int lastNegative = -1;
        start = 0;
        end = n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]<0){
                lastNegative = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        int positiveCount = n-firstPositive;
        int negativeCount = lastNegative+1;
        return Math.max(positiveCount, negativeCount);
    }
}
